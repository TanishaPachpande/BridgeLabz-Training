package com.regex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatingWords {
    public static void main(String[] args) {

        String input = "This is is a repeated repeated word test.";

        String[] words = input.toLowerCase().split("\\s+");

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new LinkedHashSet<>();

        for (String word : words) {
            word = word.replaceAll("[^a-z]", "");
            if (!seen.add(word)) {
                repeated.add(word);
            }
        }

        for (String word : repeated) {
            System.out.print(word + ", ");
        }
    }
}
