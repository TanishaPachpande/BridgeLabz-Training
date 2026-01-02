package com.objectmodeling.LibraryAndBooks;

public class Main {
    public static void main(String[] args) {

        // Creating independent Book objects
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("Head First Java", "Kathy Sierra");

        // Creating Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Same book in another library
        library2.addBook(book3);

        // Display libraries
        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}

