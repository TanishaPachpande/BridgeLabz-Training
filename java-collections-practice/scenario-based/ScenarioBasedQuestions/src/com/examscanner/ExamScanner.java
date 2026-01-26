package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner<T extends AnswerSheet> {

    private static final Pattern VALID_LINE_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,[ABCD]){6}$");

    private List<Character> answerKey;

    public ExamScanner(List<Character> answerKey) {
        this.answerKey = answerKey;
    }

    public void scanFile(String filePath) {

        Map<String, Integer> scoreMap = new HashMap<>();

        PriorityQueue<StudentScore> ranking =
                new PriorityQueue<>((a, b) -> b.getScore() - a.getScore());

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, scoreMap);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid line skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        scoreMap.forEach((name, score) ->
                ranking.offer(new StudentScore(name, score)));

        System.out.println("\n--- Exam Ranking ---");
        while (!ranking.isEmpty()) {
            System.out.println(ranking.poll());
        }
    }

    private void processLine(String line, Map<String, Integer> scoreMap) {

        if (!VALID_LINE_PATTERN.matcher(line).matches()) {
            throw new IllegalArgumentException("Bad format");
        }

        String[] tokens = line.split(",");

        String studentName = tokens[0];
        List<Character> answers = new ArrayList<>();

        for (int i = 1; i < tokens.length; i++) {
            answers.add(tokens[i].charAt(0));
        }

        int score = calculateScore(answers);
        scoreMap.put(studentName, score);
    }

    private int calculateScore(List<Character> studentAnswers) {

        int score = 0;
        for (int i = 0; i < answerKey.size(); i++) {
            if (answerKey.get(i).equals(studentAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }
}

