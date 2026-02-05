package com.resumeanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeAnalyzer {

    private static final List<String> KEYWORDS =
            Arrays.asList("Java", "Python", "Spring");

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b[6-9][0-9]{9}\\b");

    public static void main(String[] args) {

        File folder = new File("resumes"); // resumes folder
        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> candidateList = new ArrayList<>();

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Resumes folder not found");
            return;
        }

        for (File file : folder.listFiles()) {
            try {
                if (!isValidFile(file)) {
                    continue;
                }

                String content = readFile(file);
                String email = extractEmail(content);
                String phone = extractPhone(content);
                int keywordCount = countKeywords(content);

                ResumeData data = new ResumeData(email, phone, keywordCount);
                resumeMap.put(email, data);
                candidateList.add(data);

            } catch (Exception e) {
                System.out.println("Skipping file: " + file.getName());
            }
        }

        Collections.sort(candidateList);

        System.out.println("Sorted Candidates:");
        for (ResumeData rd : candidateList) {
            System.out.println(rd);
        }
    }

    private static boolean isValidFile(File file) {
        String name = file.getName().toLowerCase();
        return name.endsWith(".txt") || name.endsWith(".pdf");
    }

    private static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
        }
        return sb.toString();
    }

    private static String extractEmail(String content) {
        Matcher matcher = EMAIL_PATTERN.matcher(content);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new RuntimeException("Email not found");
    }

    private static String extractPhone(String content) {
        Matcher matcher = PHONE_PATTERN.matcher(content);
        if (matcher.find()) {
            return matcher.group();
        }
        return "Not Available";
    }

    private static int countKeywords(String content) {
        int count = 0;

        for (String keyword : KEYWORDS) {
            Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}

