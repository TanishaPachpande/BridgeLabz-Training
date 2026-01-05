package com.sortingalgorithms;

import java.util.Scanner;

public class QuickSort{

    // Partition method
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];  // pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // Quick Sort method
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int[] productPrices = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			productPrices[i]=sc.nextInt();
		}

        System.out.println("Before Sorting:");
        for (int price : productPrices)
            System.out.print(price + " ");

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : productPrices)
            System.out.print(price + " ");
    }
}

