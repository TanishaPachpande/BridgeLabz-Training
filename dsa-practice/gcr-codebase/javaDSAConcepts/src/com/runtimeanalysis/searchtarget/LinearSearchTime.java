package com.runtimeanalysis.searchtarget;

public class LinearSearchTime {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 1000000; // dataset size
        int[] arr = new int[n];

        // fill array
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int target = n - 1; // worst case

        long startTime = System.nanoTime();

        linearSearch(arr, target);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Linear Search Execution Time: "
                + executionTime / 1_000_000.0 + " ms");
    }
}
