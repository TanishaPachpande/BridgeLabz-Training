package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    private static final Pattern CHAT_PATTERN =
            Pattern.compile(
                    "\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    private Map<String, List<String>> userMessages =
            new TreeMap<>();

    private MessageFilter<Message> filter;

    public ChatLogParser(MessageFilter<Message> filter) {
        this.filter = filter;
    }

    public void parseFile(String filePath) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line);
                } catch (IllegalArgumentException e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading chat log file");
        }
    }

    private void processLine(String line) {

        Matcher matcher = CHAT_PATTERN.matcher(line);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Bad format");
        }

        String time = matcher.group(1);
        String user = matcher.group(2);
        String messageText = matcher.group(3);

        Message message =
                new Message(time, user, messageText);

        if (filter.allow(message)) {
            userMessages
                    .computeIfAbsent(user, k -> new ArrayList<>())
                    .add(messageText);
        }
    }

    public void printSummary() {

        System.out.println("\n--- Chat Summary (Productive Messages) ---");

        userMessages.forEach((user, messages) -> {
            System.out.println(user + ":");
            messages.forEach(m -> System.out.println("  - " + m));
        });
    }
}

