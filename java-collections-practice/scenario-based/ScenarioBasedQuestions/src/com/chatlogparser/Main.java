package com.chatlogparser;

public class Main {
    public static void main(String[] args) {

        MessageFilter<Message> idleFilter =
                new IdleChatFilter();

        ChatLogParser parser =
                new ChatLogParser(idleFilter);

        parser.parseFile("chatlog.txt");
        parser.printSummary();
    }
}

