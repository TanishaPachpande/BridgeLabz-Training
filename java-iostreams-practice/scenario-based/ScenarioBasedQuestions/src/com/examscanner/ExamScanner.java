package com.examscanner;


import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ExamScanner {

    private static final List<String> ANSWER_KEY =
            Arrays.asList("A", "B", "C", "D", "A", "B", "C");

    private static final Pattern VALID_LINE_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    public static void main(String[] args) {

        File file = new File("answers.csv");

        Map<String, Integer> scoreMap = new HashMap<>();

        PriorityQueue<Map.Entry<String, Integer>> resultQueue =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        readAnswerFile(file, scoreMap);

        resultQueue.addAll(scoreMap.entrySet());

        System.out.println("\n===== Exam Results (Sorted) =====");
        while (!resultQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = resultQueue.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // -------- Read CSV --------

    private static void readAnswerFile(File file,
                                       Map<String, Integer> scoreMap) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, scoreMap);
                } catch (Exception e) {
                    System.out.println("Invalid line skipped: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -------- Process Each Line --------

    private static void processLine(String line,
                                    Map<String, Integer> scoreMap) {

        if (!VALID_LINE_PATTERN.matcher(line).matches()) {
            throw new RuntimeException("Invalid format");
        }

        String[] tokens = line.split(",");

        String studentName = tokens[0];
        List<String> answers =
                Arrays.asList(Arrays.copyOfRange(tokens, 1, tokens.length));

        AnswerSheet<String> sheet =
                new MathAnswerSheet(studentName, answers);

        int score = calculateScore(sheet);
        scoreMap.put(studentName, score);
    }

    // -------- Compare Answers --------

    private static int calculateScore(AnswerSheet<String> sheet) {

        int score = 0;
        List<String> studentAnswers = sheet.getAnswers();

        for (int i = 0; i < ANSWER_KEY.size() && i < studentAnswers.size(); i++) {
            if (ANSWER_KEY.get(i).equals(studentAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }
}

