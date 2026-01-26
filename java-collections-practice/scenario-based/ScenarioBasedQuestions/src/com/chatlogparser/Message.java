package com.chatlogparser;

public class Message {
    private String timestamp;
    private String user;
    private String content;

    public Message(String timestamp, String user, String content) {
        this.timestamp = timestamp;
        this.user = user;
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }
}

