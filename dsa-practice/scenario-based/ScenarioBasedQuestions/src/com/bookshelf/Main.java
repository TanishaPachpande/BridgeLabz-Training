package com.bookshelf;

public class Main {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Harry Potter", "J.K. Rowling");
        Book b3 = new Book("Inferno", "Dan Brown");

        shelf.addBook("Fiction", b1);
        shelf.addBook("Fantasy", b2);
        shelf.addBook("Thriller", b3);

        shelf.displayCatalog();

        shelf.borrowBook("Fantasy", b2);

        shelf.displayCatalog();
    }
}

