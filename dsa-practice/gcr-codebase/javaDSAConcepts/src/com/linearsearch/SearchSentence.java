package com.linearsearch;

public class SearchSentence {

    public static String findSentence(String[] sentences, String word) {
        // Iterate through each sentence
        for (int i = 0; i < sentences.length; i++) {
            // Check if the sentence contains the word
            if (sentences[i].contains(word)) {
                return sentences[i]; // return the sentence
            }
        }
        // If word is not found in any sentence
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful language",
            "Learning data structures is important",
            "Linear search is simple",
            "Practice makes perfect"
        };

        String word = "search";

        String result = findSentence(sentences, word);

        System.out.println(result);
    }
}

