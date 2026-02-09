package com.studentlibrarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

	private static LibraryCatalog catalog;
	private List<Book> books;

	private LibraryCatalog() {
		books = new ArrayList<>();
	}

	public static LibraryCatalog getInstance() {
		if (catalog == null) {
			catalog = new LibraryCatalog();
		}
		return catalog;
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: " + book.getTitle());
	}

	public List<Book> getBooks() {
		return books;
	}
}
