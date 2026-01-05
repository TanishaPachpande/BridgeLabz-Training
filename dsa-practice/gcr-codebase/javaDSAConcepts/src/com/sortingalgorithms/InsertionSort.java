package com.sortingalgorithms;

import java.util.Scanner;

public class InsertionSort {
	 public static void insertionSort(int[] empIds) {

	        int n = empIds.length;

	        // Start from second element
	        for (int i = 1; i < n; i++) {

	            int key = empIds[i]; // element to be inserted
	            int j = i - 1;

	            // Shift elements of sorted part to the right
	            while (j >= 0 && empIds[j] > key) {
	                empIds[j + 1] = empIds[j];
	                j--;
	            }

	            // Insert key at correct position
	            empIds[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {

	    	Scanner sc = new Scanner(System.in);
			System.out.print("Enter size of array: ");
			int n=sc.nextInt();
			int[] employeeIds = new int[n];
			System.out.println("Enter array elements: ");
			for(int i=0;i<n;i++) {
				employeeIds[i]=sc.nextInt();
			}
			
	        System.out.println("Before Sorting:");
	        for (int id : employeeIds) {
	            System.out.print(id + " ");
	        }

	        insertionSort(employeeIds);

	        System.out.println("\nAfter Sorting:");
	        for (int id : employeeIds) {
	            System.out.print(id + " ");
	        }
	    }
}
