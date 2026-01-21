package com.collections.mapinterface;

import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        HashMap<String, Integer> wordCount = new HashMap<>();

            String line= "Hello world hello java";
            

                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                // Split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            

        // Print result
        System.out.println(wordCount);
    }
}
