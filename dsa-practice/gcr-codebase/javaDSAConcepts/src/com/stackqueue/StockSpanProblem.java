package com.stackqueue;

import java.util.Stack;

public class StockSpanProblem {

    // Function to calculate stock spans
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while current price >= price at stack top
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If stack is empty, price is greater than all previous
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }

        return span;
    }

    // Helper function to display array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method (Test)
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Prices:");
        displayArray(prices);

        int[] span = calculateSpan(prices);

        System.out.println("Stock Spans:");
        displayArray(span);
    }
}

