package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "input.txt";
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
            return;
        }

        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());

        wordList.sort(
            Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed()
        );

        System.out.println("Top 5 most frequent words:");

        int limit = Math.min(5, wordList.size());
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

