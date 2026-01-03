package com.linkedlist.doublelinkedlist.UndoRedoTextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.display();

        editor.undo();
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();

        editor.addState("Hello Java");
        editor.display();

        editor.redo(); // No redo possible
    }
}

