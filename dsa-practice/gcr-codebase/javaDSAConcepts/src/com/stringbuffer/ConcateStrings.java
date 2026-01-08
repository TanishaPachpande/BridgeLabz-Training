package com.stringbuffer;

import java.util.Scanner;

public class ConcateStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Taking array input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Step 1: Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Step 2: Append each string
        for (String str : arr) {
            sb.append(str);
        }

        // Step 3: Convert to String
        String result = sb.toString();

        System.out.println("Concatenated string: " + result);
    }
}

