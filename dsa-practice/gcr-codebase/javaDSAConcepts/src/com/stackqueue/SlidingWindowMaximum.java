package com.stackqueue;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class SlidingWindowMaximum {

    // Function to find maximum in each sliding window
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;

        Deque<Integer> deque = new ArrayDeque<>(); // store indices

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add current element index
            deque.offerLast(i);

            // Window has reached size k, record maximum
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    // Helper function to display array
    public static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Main method (Test)
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Input Array:");
        displayArray(nums);
        System.out.println("Window size: " + k);

        int[] maxValues = maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximum:");
        displayArray(maxValues);
    }
}

