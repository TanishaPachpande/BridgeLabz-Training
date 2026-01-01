package com.encapsulation_polymorphism.LibraryManagement;

public class Main {
	public static void main(String[] args) {
		LibraryItem l1= new Book(1, "title1", "author1");
		LibraryItem l2= new Magazine(2, "title2", "author2");
		LibraryItem l3= new DVD(3, "title3", "author3");
		
		LibraryItem[] items = {l1, l2, l3};
		
		for(LibraryItem l: items) {
			l.getItemDetails();
		    if (l instanceof Reservable) {
		        Reservable reserve = (Reservable) l;
		        reserve.reserveItem();
		        System.out.println("Availability: " + reserve.checkAvailability());
		        System.out.println("--------------------------------------------");
		    }
		}
	}
}
