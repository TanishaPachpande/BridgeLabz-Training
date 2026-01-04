package com.stackqueue;

import java.util.Stack;

public class SortStack {

    // Main sorting function
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Sort the remaining stack
        sortStack(stack);

        // Insert the top element back in sorted order
        insertSorted(stack, top);
    }

    // Helper function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int value) {
        // Base case: empty stack or value > top element
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }

        // Remove top and recur
        int top = stack.pop();
        insertSorted(stack, value);

        // Push the previous top back
        stack.push(top);
    }

    // Display stack
    private static void displayStack(Stack<Integer> stack) {
        System.out.println(stack);
    }

    // Main method (Test)
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack:");
        displayStack(stack);
    }
}
