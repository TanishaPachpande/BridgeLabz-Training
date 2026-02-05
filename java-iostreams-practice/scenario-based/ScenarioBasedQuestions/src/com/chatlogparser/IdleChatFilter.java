package com.chatlogparser;


import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {

    private List<String> idleKeywords;

    public IdleChatFilter(List<String> idleKeywords) {
        this.idleKeywords = idleKeywords;
    }

    @Override
    public boolean allow(String message) {
        String lower = message.toLowerCase();
        for (String keyword : idleKeywords) {
            if (lower.contains(keyword)) {
                return false;
            }
        }
        return true;
    }
}

