package com.encapsulation_polymorphism.LibraryManagement;

public class DVD extends LibraryItem implements Reservable{

	public DVD(int itemId, String title, String author) {
		super(itemId, title, author);
	}
	
	public int getLoanDuration() {
		return 20;
	}

}
