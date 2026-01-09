package com.linearsearch;

public class FirstNegative {

    public static int findFirstNegative(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the element is negative
            if (arr[i] < 0) {
                return i; // return index
            }
        }
        // If no negative number found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, -5, 9, -3};

        int result = findFirstNegative(arr);

        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found");
        }
    }
}

