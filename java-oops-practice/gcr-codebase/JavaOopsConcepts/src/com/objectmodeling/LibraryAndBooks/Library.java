package com.objectmodeling.LibraryAndBooks;

import java.util.ArrayList;

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

