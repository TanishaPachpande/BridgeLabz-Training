package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    private Map<String, List<String>> categorizedFeedback = new HashMap<>();

    public FeedbackGuru() {
        categorizedFeedback.put("Positive", new ArrayList<>());
        categorizedFeedback.put("Neutral", new ArrayList<>());
        categorizedFeedback.put("Negative", new ArrayList<>());
    }

    public void analyzeFolder(String folderPath, T feedbackType) {

        File folder = new File(folderPath);

        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                readFile(file, feedbackType);
            }
        }
    }

    private void readFile(File file, T feedbackType) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    Feedback<T> feedback = parseFeedback(line, feedbackType);
                    categorizeFeedback(feedback);
                } catch (IllegalArgumentException e) {
                    System.out.println("Skipping invalid feedback: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }

    private Feedback<T> parseFeedback(String line, T feedbackType) {

        Matcher matcher = RATING_PATTERN.matcher(line);

        if (!matcher.find()) {
            throw new IllegalArgumentException("Rating not found");
        }

        int rating = Integer.parseInt(matcher.group(1));
        return new Feedback<>(feedbackType, line, rating);
    }

    private void categorizeFeedback(Feedback<T> feedback) {

        int rating = feedback.getRating();

        if (rating >= 8) {
            categorizedFeedback.get("Positive").add(feedback.getMessage());
        } else if (rating >= 5) {
            categorizedFeedback.get("Neutral").add(feedback.getMessage());
        } else {
            categorizedFeedback.get("Negative").add(feedback.getMessage());
        }
    }

    public void printSummary() {

        System.out.println("\n---- Feedback Summary ----");
        categorizedFeedback.forEach((category, feedbacks) -> {
            System.out.println(category + " Feedback:");
            feedbacks.forEach(f -> System.out.println("  - " + f));
        });
    }
}

