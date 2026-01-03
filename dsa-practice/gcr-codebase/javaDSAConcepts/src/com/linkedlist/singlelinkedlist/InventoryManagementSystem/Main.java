package com.linkedlist.singlelinkedlist.InventoryManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();

        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Display All Items");
            System.out.println("9. Calculate Total Value");
            System.out.println("10. Sort by Name");
            System.out.println("11. Sort by Price");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1)
                        inventory.addAtBeginning(id, name, qty, price);
                    else if (choice == 2)
                        inventory.addAtEnd(id, name, qty, price);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        inventory.addAtPosition(pos, id, name, qty, price);
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    inventory.removeByItemId(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Item ID: ");
                    int i = sc.nextInt();
                    System.out.print("Enter New Quantity: ");
                    inventory.updateQuantity(i, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Item ID: ");
                    inventory.searchById(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter Item Name: ");
                    inventory.searchByName(sc.nextLine());
                    break;

                case 8:
                    inventory.displayAll();
                    break;

                case 9:
                    inventory.calculateTotalValue();
                    break;

                case 10:
                    inventory.sortByName(true);
                    break;

                case 11:
                    inventory.sortByPrice(true);
                    break;

                case 12:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

