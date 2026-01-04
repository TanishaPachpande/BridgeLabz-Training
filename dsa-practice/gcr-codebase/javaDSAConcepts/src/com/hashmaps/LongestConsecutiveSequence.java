package com.hashmaps;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    // Function to find length of longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            // Only start counting if num-1 is not present (start of sequence)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    streak += 1;
                }

                longestStreak = Math.max(longestStreak, streak);
            }
        }

        return longestStreak;
    }

    // Main method (Test)
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Input Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int length = longestConsecutive(arr);
        System.out.println("\nLength of Longest Consecutive Sequence: " + length);
    }
}

