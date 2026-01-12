package com.bookshelf;

import java.util.*;

class BookShelf {
    // genre → list of books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    private HashSet<Book> uniqueBooks = new HashSet<>(); // avoid duplicates

    // Add book
    public void addBook(String genre, Book book) {
        if (uniqueBooks.contains(book)) {
            System.out.println("Book already exists!");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println("Book added successfully.");
    }

    // Borrow (remove) book
    public void borrowBook(String genre, Book book) {
        LinkedList<Book> books = catalog.get(genre);

        if (books != null && books.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Display catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  " + book);
            }
        }
    }
}

