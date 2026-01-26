package com.examscanner;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> answerKey =
                List.of('A', 'B', 'C', 'D', 'A', 'B');

        ExamScanner<MathAnswerSheet> scanner =
                new ExamScanner<>(answerKey);

        scanner.scanFile("answers.csv");
    }
}

