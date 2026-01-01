package com.encapsulation_polymorphism.LibraryManagement;

public abstract class LibraryItem {
	private int itemId;
	private String title;
	private String author;
	private boolean isAvailable = false;
	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	
	public abstract int getLoanDuration();
	
	public void getItemDetails() {
		System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
	}
	
    
    public void reserveItem() {
        if (checkAvailability()) {
            System.out.println(title + "is reserved");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public boolean checkAvailability() {
        return true;
    }
}
