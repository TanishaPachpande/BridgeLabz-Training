package com.chatlogparser;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatLogParser {

    // [12:02 PM] John: Message
    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    public static void main(String[] args) {

        String fileName = "chatlog.txt";

        // TreeMap → auto sorted users
        Map<String, List<String>> userMessages = new TreeMap<>();

        List<String> idleKeywords = Arrays.asList("lol", "brb", "haha");
        MessageFilter<String> filter = new IdleChatFilter(idleKeywords);

        readChatLog(fileName, userMessages, filter);

        printSummary(userMessages);
    }

    // -------- Read Chat File --------

    private static void readChatLog(String fileName,
                                    Map<String, List<String>> userMessages,
                                    MessageFilter<String> filter) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, userMessages, filter);
                } catch (Exception e) {
                    System.out.println("Invalid line skipped: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------- Process Each Line --------

    private static void processLine(String line,
                                    Map<String, List<String>> userMessages,
                                    MessageFilter<String> filter) {

        Matcher matcher = CHAT_PATTERN.matcher(line);

        if (!matcher.matches()) {
            throw new RuntimeException("Invalid format");
        }

        String timestamp = matcher.group(1); // extracted if needed
        String user = matcher.group(2);
        String message = matcher.group(3);

        if (!filter.allow(message)) {
            return;
        }

        userMessages
                .computeIfAbsent(user, k -> new ArrayList<>())
                .add("[" + timestamp + "] " + message);
    }

    // -------- Print Summary --------

    private static void printSummary(Map<String, List<String>> userMessages) {

        System.out.println("\n===== Chat Analysis Summary =====");

        for (Map.Entry<String, List<String>> entry : userMessages.entrySet()) {
            System.out.println("\nUser: " + entry.getKey());
            for (String msg : entry.getValue()) {
                System.out.println(msg);
            }
        }
    }
}

