package com.texteditor;
import java.util.Stack;

public class TextEditor {

    private String content = "";

    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    public void insert(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear(); // clear redo after new action
        System.out.println("Inserted: " + text);
    }

    // Delete text
    public void delete(String text) {
        if (content.endsWith(text)) {
            content = content.substring(0, content.length() - text.length());
            undoStack.push(new Action("delete", text));
            redoStack.clear();
            System.out.println("Deleted: " + text);
        } else {
            System.out.println("Delete operation failed");
        }
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("delete")) {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content += action.text;
        } else if (action.type.equals("delete")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    // Display content
    public void showContent() {
        System.out.println("Current Text: " + content);
    }
}
