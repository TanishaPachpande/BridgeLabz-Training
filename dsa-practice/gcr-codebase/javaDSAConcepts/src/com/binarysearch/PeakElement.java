package com.binarysearch;

public class PeakElement {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak
            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid; // peak index found
            }

            // If left neighbor is greater, search left side
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else search right side
            else {
                left = mid + 1;
            }
        }

        return -1; // this line will never be reached
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}

