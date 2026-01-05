package com.sortingalgorithms;

import java.util.Scanner;

public class CountingSort {

    public static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Step 1: Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Step 3: Place elements into output array (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy output back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int[] studentAges = new int[n];
		System.out.println("Enter ages between 10 and 18: ");
		for(int i=0;i<n;i++) {
			studentAges[i]=sc.nextInt();
		}

        System.out.println("Before Sorting:");
        for (int age : studentAges)
            System.out.print(age + " ");

        countingSort(studentAges);

        System.out.println("\nAfter Sorting:");
        for (int age : studentAges)
            System.out.print(age + " ");
    }
}
