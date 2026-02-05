package com.examresultuploader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Pattern;

public class ExamResultUploader {

    // RollNo,Name,Subject,Marks
    private static final Pattern VALID_LINE_PATTERN =
            Pattern.compile("\\d+,\\w+( \\w+)?,\\w+,\\d{1,3}");

    public static void main(String[] args) {

        String fileName = "results.csv";

        Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

        readResultFile(fileName, subjectMarksMap);

        findTopScorerPerSubject(subjectMarksMap);
    }

    // -------- Read CSV File --------

    private static void readResultFile(String fileName,
                                       Map<String, List<Integer>> subjectMarksMap) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    ExamRecord<Integer> record = parseLine(line);

                    subjectMarksMap
                            .computeIfAbsent(record.getSubject(), k -> new ArrayList<>())
                            .add(record.getMarks());

                } catch (InvalidResultException e) {
                    System.out.println("Invalid row skipped: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------- Parse & Validate Line --------

    private static ExamRecord<Integer> parseLine(String line)
            throws InvalidResultException {

        if (!VALID_LINE_PATTERN.matcher(line).matches()) {
            throw new InvalidResultException("Invalid format -> " + line);
        }

        String[] data = line.split(",");

        int rollNo = Integer.parseInt(data[0]);
        String name = data[1];
        String subject = data[2];
        int marks = Integer.parseInt(data[3]);

        if (marks < 0 || marks > 100) {
            throw new InvalidResultException("Invalid marks -> " + line);
        }

        return new ExamRecord<>(rollNo, name, subject, marks);
    }

    // -------- Find Top Scorer Using PriorityQueue --------

    private static void findTopScorerPerSubject(
            Map<String, List<Integer>> subjectMarksMap) {

        System.out.println("\n===== Top Scorer Per Subject =====");

        for (Map.Entry<String, List<Integer>> entry : subjectMarksMap.entrySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(entry.getValue());

            System.out.println(
                    entry.getKey() + " -> Highest Marks: " + pq.peek()
            );
        }
    }
}

