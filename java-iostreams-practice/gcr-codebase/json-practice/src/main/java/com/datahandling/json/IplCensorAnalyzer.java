package com.datahandling.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class IplCensorAnalyzer {

    // ---------- MODEL ----------
    static class Match {
        public int match_id;
        public String team1;
        public String team2;
        public Map<String, Integer> score;
        public String winner;
        public String player_of_match;
    }

    // ---------- CENSOR LOGIC ----------
    private static String maskTeamName(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }

    private static void censorMatch(Match match) {
        match.team1 = maskTeamName(match.team1);
        match.team2 = maskTeamName(match.team2);
        match.winner = maskTeamName(match.winner);
        match.player_of_match = "REDACTED";
    }

    // ---------- JSON PROCESSING ----------
    private static void processJson(String input, String output) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<Match> matches = mapper.readValue(
                new File(input),
                new TypeReference<List<Match>>() {}
        );

        matches.forEach(IplCensorAnalyzer::censorMatch);

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(output), matches);
    }

    // ---------- CSV PROCESSING ----------
    private static void processCsv(String input, String output) throws Exception {

        try (CSVReader reader = new CSVReader(new FileReader(input));
             CSVWriter writer = new CSVWriter(new FileWriter(output))) {

            String[] header = reader.readNext();
            writer.writeNext(header);

            String[] row;
            while ((row = reader.readNext()) != null) {
                row[1] = maskTeamName(row[1]); // team1
                row[2] = maskTeamName(row[2]); // team2
                row[5] = maskTeamName(row[5]); // winner
                row[6] = "REDACTED";            // player_of_match

                writer.writeNext(row);
            }
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        processJson("matches.json", "censored_matches.json");
        processCsv("matches.csv", "censored_matches.csv");

        System.out.println("Censorship completed successfully.");
    }
}


