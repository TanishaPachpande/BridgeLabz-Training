package com.linkedlist.doublelinkedlist.UndoRedoTextEditor;

class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int maxSize;
    private int size;

    TextEditor(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        head = tail = current = null;
    }

    // Add new state
    public void addState(String text) {
        TextState newState = new TextState(text);

        // Clear redo history if exists
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countStates();
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Maintain fixed history size
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current text
    public void display() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }

    // Count states
    private int countStates() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
