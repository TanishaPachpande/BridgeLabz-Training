package com.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // StringBuilder to store result
        StringBuilder result = new StringBuilder();

        // HashSet to track unique characters
        HashSet<Character> seen = new HashSet<>();

        // Iterate through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character not already seen
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        // Convert StringBuilder to String
        String output = result.toString();

        System.out.println("String without duplicates: " + output);

    }
}

