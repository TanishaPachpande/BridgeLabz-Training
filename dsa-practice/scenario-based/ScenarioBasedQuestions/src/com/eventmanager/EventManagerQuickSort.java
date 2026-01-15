package com.eventmanager;

import java.util.Arrays;

public class EventManagerQuickSort {

    public static void main(String[] args) {
        int[] ticketPrices = {1500, 800, 1200, 500, 2000, 1000, 300};

        quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("Sorted Ticket Prices:");
        System.out.println(Arrays.toString(ticketPrices));

        // Top 3 cheapest tickets
        System.out.println("\nCheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.println(ticketPrices[i]);
        }

        // Top 3 expensive tickets
        System.out.println("\nMost Expensive Tickets:");
        for (int i = ticketPrices.length - 1; i >= ticketPrices.length - 3; i--) {
            System.out.println(ticketPrices[i]);
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

