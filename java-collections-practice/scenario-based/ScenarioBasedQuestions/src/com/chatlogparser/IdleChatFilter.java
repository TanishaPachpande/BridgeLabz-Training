package com.chatlogparser;

import java.util.List;

public class IdleChatFilter implements MessageFilter<Message> {

    private List<String> idleKeywords =
            List.of("lol", "brb", "haha", "ok", "bye");

    @Override
    public boolean allow(Message message) {
        String text = message.getContent().toLowerCase();
        return idleKeywords.stream().noneMatch(text::contains);
    }
}

