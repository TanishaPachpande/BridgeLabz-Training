package com.constructors.level1;

public class BookLibrarySystem {
	
	// Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }
}
