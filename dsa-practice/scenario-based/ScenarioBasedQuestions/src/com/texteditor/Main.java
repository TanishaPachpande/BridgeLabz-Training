package com.texteditor;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello ");
        editor.insert("World");
        editor.showContent();

        editor.delete("World");
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.redo();
        editor.showContent();
    }
}

