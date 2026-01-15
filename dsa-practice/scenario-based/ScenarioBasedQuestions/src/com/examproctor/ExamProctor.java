package com.examproctor;

import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack;              // Question navigation
    private HashMap<Integer, String> answerMap;           // Student answers
    private HashMap<Integer, String> correctAnswerMap;    // Correct answers

    public ExamProctor() {
        navigationStack = new Stack<>();
        answerMap = new HashMap<>();
        correctAnswerMap = new HashMap<>();

        // Sample correct answers
        correctAnswerMap.put(1, "A");
        correctAnswerMap.put(2, "B");
        correctAnswerMap.put(3, "C");
        correctAnswerMap.put(4, "D");
    }

    // Track navigation
    public void visitQuestion(int qId) {
        navigationStack.push(qId);
        System.out.println("Visited Question: " + qId);
    }

    // Store answers
    public void submitAnswer(int qId, String answer) {
        answerMap.put(qId, answer);
        System.out.println("Answer saved for Question " + qId);
    }

    // Show navigation history
    public void showNavigationHistory() {
        System.out.println("\nNavigation Stack:");
        for (int q : navigationStack) {
            System.out.println("Question " + q);
        }
    }

    // Function: Auto-calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswerMap.keySet()) {
            if (answerMap.containsKey(qId) &&
                answerMap.get(qId).equals(correctAnswerMap.get(qId))) {
                score++;
            }
        }
        return score;
    }

    // Submit exam
    public void submitExam() {
        System.out.println("\nExam Submitted.");
        int score = calculateScore();
        System.out.println("Final Score: " + score + "/" + correctAnswerMap.size());
    }
}

