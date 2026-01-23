package com.tailorshop;

import java.util.Scanner;

public class TailorShopInsertionSort {

    // Insertion Sort method
    public static void insertionSort(int[] deadlines) {
        for (int i = 1; i < deadlines.length; i++) {
            int key = deadlines[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && deadlines[j] > key) {
                deadlines[j + 1] = deadlines[j];
                j--;
            }
            deadlines[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of orders
        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        int[] deadlines = new int[n];

        // Input deadlines
        System.out.println("Enter delivery deadlines:");
        for (int i = 0; i < n; i++) {
            deadlines[i] = sc.nextInt();
        }

        // Sort deadlines
        insertionSort(deadlines);

        // Display sorted orders
        System.out.println("Orders sorted by delivery deadline:");
        for (int d : deadlines) {
            System.out.print(d + " ");
        }

        sc.close();
    }
}

