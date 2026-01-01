package com.inheritance.single.LibraryManagement;

public class Book {
	protected String title;
	protected int publicationYear;
	
	public Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	void displayInfo() {
		System.out.println("Publication year: "+publicationYear);
		System.out.println("Book title: "+title);
	}
}
