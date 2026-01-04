package com.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

    // Function to check if pair exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            map.put(num, true);
        }

        return false;
    }

    // Main method (Test)
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int target = 16;

        System.out.println("Input Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nTarget Sum: " + target);

        if (!hasPairWithSum(arr, target)) {
            System.out.println("No pair with given sum found");
        }
    }
}

