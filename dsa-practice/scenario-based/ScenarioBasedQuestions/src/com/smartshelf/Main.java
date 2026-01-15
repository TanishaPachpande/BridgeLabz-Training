package com.smartshelf;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartShelf shelf = new SmartShelf();

        while (true) {
            System.out.println("\n--- SmartShelf Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Shelf");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    shelf.addBook(new Book(title, author));
                    System.out.println("Book added & shelf updated.");
                    break;

                case 2:
                    shelf.displayShelf();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}

