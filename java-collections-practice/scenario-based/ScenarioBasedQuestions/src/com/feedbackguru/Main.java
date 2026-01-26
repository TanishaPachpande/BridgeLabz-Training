package com.feedbackguru;

public class Main {
    public static void main(String[] args) {

        FeedbackGuru<String> guru = new FeedbackGuru<>();

        guru.analyzeFolder("feedbacks", "Service");

        guru.printSummary();
    }
}

