package com.constructors.level1;

public class LibraryBook {

	// Attributes
		String title;
		String author;
		int price;
		boolean availability;
		
		// Default constructor
		LibraryBook(){
			title="Unknown";
			author="Unknown";
			price=0;
			availability=false;
		}
		
		// Parameterized constructor
		LibraryBook(String title, String author, int price, boolean availability) {
			this.title=title;
			this.author=author;
			this.price=price;
			this.availability=availability;
		}
	    
	    // Method to display book details
	    void displayBookingDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	        System.out.println("Availability: " + availability);
	    }
	    
	    
	    void borrowBook() {
	    	if(availability) {
	    		availability=false;
	    		System.out.println("You have successfully borrowed:"+ title);
	    	}else {
	    		System.out.println("Sorry! the book is already borrowed");
	    	}
	    }
	    
		public static void main(String[] args) {
			
			LibraryBook b = new LibraryBook("xyz","abc",250,false);
			b.displayBookingDetails();
			b.borrowBook();
		}
}
