package com.runtimeanalysis.searchtarget;

public class BinarySearchTime {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 1000000; // dataset size
        int[] arr = new int[n];

        // fill sorted array
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int target = n - 1;

        long startTime = System.nanoTime();

        binarySearch(arr, target);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Binary Search Execution Time: "
                + executionTime / 1_000_000.0 + " ms");
    }
}

