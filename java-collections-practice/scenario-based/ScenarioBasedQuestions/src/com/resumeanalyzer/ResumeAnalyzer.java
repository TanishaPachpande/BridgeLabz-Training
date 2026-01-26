package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b[6-9][0-9]{9}\\b");

    private static final Pattern KEYWORD_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {

        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> resumeList = new ArrayList<>();

        File folder = new File("resumes"); // resumes folder

        for (File file : folder.listFiles()) {
            try {
                ResumeData data = processResume(file);
                resumeMap.put(data.getEmail(), data);
                resumeList.add(data);
            } catch (InvalidResumeFormatException | IOException e) {
                System.out.println("Skipping file: " + file.getName() + " → " + e.getMessage());
            }
        }

        // Sort candidates by keyword match count (descending)
        resumeList.sort((r1, r2) ->
                Integer.compare(r2.getKeywordMatchCount(), r1.getKeywordMatchCount()));

        System.out.println("---- Ranked Candidates ----");
        resumeList.forEach(System.out::println);
    }

    private static ResumeData processResume(File file)
            throws IOException, InvalidResumeFormatException {

        if (!file.getName().endsWith(".txt")) {
            throw new InvalidResumeFormatException("Unsupported file format");
        }

        StringBuilder content = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append(" ");
        }
        br.close();

        String text = content.toString();

        String email = extractFirstMatch(EMAIL_PATTERN, text);
        String phone = extractFirstMatch(PHONE_PATTERN, text);

        if (email == null) {
            throw new InvalidResumeFormatException("Email not found");
        }

        int keywordCount = countKeywords(text);

        return new ResumeData(email, phone, keywordCount, file.getName());
    }

    private static String extractFirstMatch(Pattern pattern, String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    private static int countKeywords(String text) {
        Matcher matcher = KEYWORD_PATTERN.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
