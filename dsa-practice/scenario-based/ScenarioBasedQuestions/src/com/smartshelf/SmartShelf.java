package com.smartshelf;

import java.util.ArrayList;

public class SmartShelf {

    private ArrayList<Book> books = new ArrayList<>();

    // Insertion sort logic applied while adding a book
    public void addBook(Book newBook) {

        books.add(newBook);   // add at end
        int i = books.size() - 1;

        // Shift larger titles to the right
        while (i > 0 &&
                books.get(i - 1).title.compareToIgnoreCase(newBook.title) > 0) {

            books.set(i, books.get(i - 1));
            i--;
        }

        // Insert book at correct position
        books.set(i, newBook);
    }

    public void displayShelf() {
        System.out.println("\n Sorted Reading List:");
        for (Book b : books) {
            b.display();
        }
    }
}

