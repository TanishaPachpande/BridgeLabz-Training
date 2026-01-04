package com.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    // Function to find two indices
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[0]; // no solution found
    }

    // Main method (Test)
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Input Array:");
        for (int num : nums) System.out.print(num + " ");
        System.out.println("\nTarget Sum: " + target);

        int[] indices = twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("Indices Found: [" + indices[0] + ", " + indices[1] + "]");
            System.out.println("Values: (" + nums[indices[0]] + ", " + nums[indices[1]] + ")");
        } else {
            System.out.println("No valid pair found");
        }
    }
}

