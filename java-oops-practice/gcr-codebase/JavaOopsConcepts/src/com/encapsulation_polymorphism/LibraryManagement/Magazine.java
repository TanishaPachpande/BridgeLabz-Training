package com.encapsulation_polymorphism.LibraryManagement;

public class Magazine extends LibraryItem implements Reservable{

	public Magazine(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	public int getLoanDuration() {
		return 35;
	}

	
}
