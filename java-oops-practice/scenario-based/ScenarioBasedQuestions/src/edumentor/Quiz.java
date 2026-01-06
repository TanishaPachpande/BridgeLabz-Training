package edumentor;

import java.util.Scanner;

class Quiz {
    private String[] questions;          // internal question bank (PRIVATE)
    private final int[] correctAnswers;  // encapsulation: cannot modify once set
    private int score;
    private int difficultyLevel;

    // Constructor with difficulty
    public Quiz(String[] questions, int[] correctAnswers, int difficultyLevel) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.difficultyLevel = difficultyLevel;
    }

    // Conduct Quiz
    public void conductQuiz() {
        Scanner sc = new Scanner(System.in);
        score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter answer (1-4): ");
            int userAnswer = sc.nextInt();

            // Operator usage
            if (userAnswer == correctAnswers[i]) {
                score++;
            }
        }
    }

    // Percentage calculation using operators
    public double calculatePercentage() {
        return (score * 100.0) / questions.length;
    }

    public void displayResult() {
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}