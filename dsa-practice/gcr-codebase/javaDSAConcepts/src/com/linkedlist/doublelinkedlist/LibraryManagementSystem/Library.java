package com.linkedlist.doublelinkedlist.LibraryManagementSystem;

class Library {
    private BookNode head;
    private BookNode tail;

    // Add book at beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newBook = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add book at end
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newBook = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add book at specific position (1-based index)
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newBook = new BookNode(id, title, author, genre, available);
        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
    }

    // Remove book by ID
    public void removeById(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Search book by title or author
    public void searchBook(String keyword) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) ||
                temp.author.equalsIgnoreCase(keyword)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No matching book found.");
    }

    // Update availability status
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display books forward
    public void displayForward() {
        BookNode temp = head;
        System.out.println("Books (Forward Order):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display books reverse
    public void displayReverse() {
        BookNode temp = tail;
        System.out.println("Books (Reverse Order):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display single book
    private void displayBook(BookNode b) {
        System.out.println(
            "ID: " + b.bookId +
            ", Title: " + b.title +
            ", Author: " + b.author +
            ", Genre: " + b.genre +
            ", Available: " + (b.available ? "Yes" : "No")
        );
    }
}

