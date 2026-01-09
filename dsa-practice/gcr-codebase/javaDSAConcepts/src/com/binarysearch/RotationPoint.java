package com.binarysearch;

public class RotationPoint {

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary Search
        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                // Smallest element is in right half
                left = mid + 1;
            } else {
                // Smallest element is in left half (including mid)
                right = mid;
            }
        }

        // left == right is the index of smallest element
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};

        int index = findRotationPoint(arr);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}

