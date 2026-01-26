package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

    private static final Pattern VALID_LINE_PATTERN =
            Pattern.compile("^\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}$");

    private Map<String, List<Integer>> subjectMarks = new HashMap<>();

    public void processFile(String filePath, T examType) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    ExamResult<T> result = parseLine(line, examType);
                    storeMarks(result);
                } catch (InvalidResultFormatException |
                         MissingMarksException e) {
                    System.out.println("Skipping record: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        printTopScorers();
    }

    private ExamResult<T> parseLine(String line, T examType)
            throws InvalidResultFormatException, MissingMarksException {

        if (!VALID_LINE_PATTERN.matcher(line).matches()) {
            throw new InvalidResultFormatException("Invalid format → " + line);
        }

        String[] tokens = line.split(",");

        String rollNo = tokens[0];
        String name = tokens[1];
        String subject = tokens[2];

        if (tokens[3].isEmpty()) {
            throw new MissingMarksException("Missing marks for " + name);
        }

        int marks = Integer.parseInt(tokens[3]);

        if (marks < 0 || marks > 100) {
            throw new InvalidResultFormatException("Invalid marks: " + marks);
        }

        return new ExamResult<>(rollNo, name, examType, subject, marks);
    }

    private void storeMarks(ExamResult<T> result) {

        subjectMarks
                .computeIfAbsent(result.getSubject(), k -> new ArrayList<>())
                .add(result.getMarks());
    }

    private void printTopScorers() {

        System.out.println("\n--- Top Scorers Per Subject ---");

        for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(entry.getValue());

            System.out.println(entry.getKey() +
                    " → Top Score: " + pq.peek());
        }
    }
}

