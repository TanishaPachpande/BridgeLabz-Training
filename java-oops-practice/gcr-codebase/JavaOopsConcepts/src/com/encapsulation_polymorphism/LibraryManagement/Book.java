package com.encapsulation_polymorphism.LibraryManagement;

public class Book extends LibraryItem implements Reservable{

	public Book(int itemId, String title, String author) {
		super(itemId, title, author);
	}
	
	public int getLoanDuration() {
		return 21;
	}

	
}
