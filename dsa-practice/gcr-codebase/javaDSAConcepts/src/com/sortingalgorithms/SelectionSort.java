package com.sortingalgorithms;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        // One by one move boundary of unsorted array
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int[] examScores = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			examScores[i]=sc.nextInt();
		}

        System.out.println("Before Sorting:");
        for (int score : examScores)
            System.out.print(score + " ");

        selectionSort(examScores);

        System.out.println("\nAfter Sorting:");
        for (int score : examScores)
            System.out.print(score + " ");
    }
}

