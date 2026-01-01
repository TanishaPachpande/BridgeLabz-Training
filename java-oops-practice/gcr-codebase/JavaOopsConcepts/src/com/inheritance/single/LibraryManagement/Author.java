package com.inheritance.single.LibraryManagement;

public class Author extends Book {
	private String name;
	private String bio;
	
	public Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	void displayInfo() {
		System.out.println("Author name: "+name);
		System.out.println("Publication year: "+publicationYear);
		System.out.println("Book title: "+title);
		System.out.println("Bio: "+bio);
	}
}
