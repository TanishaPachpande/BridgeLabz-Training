package com.linkedlist.doublelinkedlist.MovieManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        while (true) {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Update Rating");
            System.out.println("8. Display Forward");
            System.out.println("9. Display Reverse");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();

                    if (choice == 1)
                        list.addAtBeginning(title, director, year, rating);
                    else if (choice == 2)
                        list.addAtEnd(title, director, year, rating);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(pos, title, director, year, rating);
                    }
                    break;

                case 4:
                    System.out.print("Enter Movie Title to Remove: ");
                    list.removeByTitle(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter Director Name: ");
                    list.searchByDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Rating: ");
                    list.searchByRating(sc.nextDouble());
                    break;

                case 7:
                    System.out.print("Enter Movie Title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    double r = sc.nextDouble();
                    list.updateRating(t, r);
                    break;

                case 8:
                    list.displayForward();
                    break;

                case 9:
                    list.displayReverse();
                    break;

                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

