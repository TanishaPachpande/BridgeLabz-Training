package com.texteditor;

public class Action {
    String type;     // insert or delete
    String text;     // text involved in action

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}

