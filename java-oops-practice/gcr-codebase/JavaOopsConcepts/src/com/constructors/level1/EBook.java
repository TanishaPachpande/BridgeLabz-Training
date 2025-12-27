package com.constructors.level1;

public class EBook extends BookLibrarySystem{
	String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Demonstrating access modifiers
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);          // public
        System.out.println("Title: " + title);        // protected
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("Format: " + fileFormat);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        EBook ebook = new EBook(
                "5166307",
                "Effective Java",
                "xyz",
                "PDF"
        );

        ebook.displayEBookDetails();

        // Modifying author using setter
        ebook.setAuthor("abc");
        System.out.println("\nAfter Author Update:");
        ebook.displayEBookDetails();
    }
}
