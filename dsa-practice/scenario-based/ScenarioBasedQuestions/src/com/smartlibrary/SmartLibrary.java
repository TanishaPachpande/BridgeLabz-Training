package com.smartlibrary;

public class SmartLibrary {

    public static void insertionSort(String[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] borrowedBooks = {
            "Algorithms",
            "Data Structures",
            "Operating Systems",
            "Computer Networks"
        };

        System.out.println("Before Sorting:");
        for (String book : borrowedBooks) {
            System.out.print(book + " | ");
        }

        insertionSort(borrowedBooks);

        System.out.println("\n\nAfter Sorting (Alphabetical Order):");
        for (String book : borrowedBooks) {
            System.out.print(book + " | ");
        }
    }
}

