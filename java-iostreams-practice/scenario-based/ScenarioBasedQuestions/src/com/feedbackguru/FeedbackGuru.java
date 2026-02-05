package com.feedbackguru;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeedbackGuru {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    public static void main(String[] args) {

        File folder = new File("feedbacks");

        Map<String, List<String>> categorizedFeedback = new HashMap<>();
        categorizedFeedback.put("Positive", new ArrayList<>());
        categorizedFeedback.put("Neutral", new ArrayList<>());
        categorizedFeedback.put("Negative", new ArrayList<>());

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Feedback folder not found");
            return;
        }

        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                readFeedbackFile(file, categorizedFeedback);
            }
        }

        printSummary(categorizedFeedback);
    }

    // -------- Read File --------

    private static void readFeedbackFile(File file,
                                        Map<String, List<String>> categorizedFeedback) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, categorizedFeedback);
                } catch (Exception e) {
                    System.out.println("Invalid feedback skipped: " + line);
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }

    // -------- Process Each Line --------

    private static void processLine(String line,
                                    Map<String, List<String>> categorizedFeedback) {

        Matcher matcher = RATING_PATTERN.matcher(line);

        if (!matcher.find()) {
            throw new RuntimeException("Rating not found");
        }

        int rating = Integer.parseInt(matcher.group(1));
        FeedbackCategory category = categorizeRating(rating);

        categorizedFeedback
                .get(category.name().substring(0, 1) +
                     category.name().substring(1).toLowerCase())
                .add(line);
    }

    // -------- Categorize Rating --------

    private static FeedbackCategory categorizeRating(int rating) {
        if (rating >= 8) {
            return FeedbackCategory.POSITIVE;
        } else if (rating >= 5) {
            return FeedbackCategory.NEUTRAL;
        } else {
            return FeedbackCategory.NEGATIVE;
        }
    }

    // -------- Print Summary --------

    private static void printSummary(Map<String, List<String>> categorizedFeedback) {

        System.out.println("\n===== Feedback Summary =====");

        for (Map.Entry<String, List<String>> entry : categorizedFeedback.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Feedback:");
            for (String feedback : entry.getValue()) {
                System.out.println(feedback);
            }
        }
    }
}

