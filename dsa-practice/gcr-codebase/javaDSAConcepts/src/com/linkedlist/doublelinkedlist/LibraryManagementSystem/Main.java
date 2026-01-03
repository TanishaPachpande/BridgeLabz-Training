package com.linkedlist.doublelinkedlist.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addAtEnd(101, "Java Basics", "James Gosling", "Programming", true);
        lib.addAtBeginning(102, "DSA", "Mark Allen", "Computer Science", true);
        lib.addAtEnd(103, "Python", "Guido", "Programming", false);
        lib.addAtPosition(2, 104, "DBMS", "Navathe", "Database", true);

        lib.displayForward();
        System.out.println();

        lib.displayReverse();
        System.out.println();

        lib.searchBook("Guido");
        lib.updateAvailability(103, true);

        System.out.println("Total Books: " + lib.countBooks());

        lib.removeById(102);
        lib.displayForward();
    }
}

