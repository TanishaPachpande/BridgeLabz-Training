package com.hashmaps;

import java.util.*;

public class ZeroSumSubarray {

    // Function to find all zero-sum subarrays
    public static void findZeroSumSubarrays(int[] arr) {
        // Map to store cumulative sum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Initialize with sum 0 at index -1
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        System.out.println("Zero-sum subarrays (startIndex, endIndex):");

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum seen before, zero-sum subarray exists
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int startIndex : indices) {
                    System.out.println("(" + (startIndex + 1) + ", " + i + ")");
                }
            }

            // Add current index to map
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    // Main method (Test)
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        System.out.println("Input Array: " + Arrays.toString(arr));
        findZeroSumSubarrays(arr);
    }
}

