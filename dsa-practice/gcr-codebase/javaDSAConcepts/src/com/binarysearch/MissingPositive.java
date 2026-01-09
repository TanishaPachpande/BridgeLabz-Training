package com.binarysearch;

import java.util.Arrays;

public class MissingPositive {

    // Part 1: Find first missing positive integer
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Mark numbers by making their index negative
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);

            if (value >= 1 && value <= n) {
                if (arr[value - 1] > 0) {
                    arr[value - 1] = -arr[value - 1];
                }
            }
        }

        // Step 2: Find first index with positive value
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // Part 2: Binary Search for target index
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1};
        int target = 4;

        // Copy array because firstMissingPositive modifies it
        int[] copyForMissing = Arrays.copyOf(numbers, numbers.length);

        int missing = firstMissingPositive(copyForMissing);
        System.out.println("First missing positive integer: " + missing);

        // Sort array before binary search
        Arrays.sort(numbers);

        int index = binarySearch(numbers, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}

