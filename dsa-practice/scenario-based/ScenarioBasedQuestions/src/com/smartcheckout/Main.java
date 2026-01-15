package com.smartcheckout;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Supermarket market = new Supermarket();

        while (true) {
            System.out.println("\n--- SmartCheckout Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Next Customer");
            System.out.println("3. Show Stock");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    Customer c = new Customer(name);

                    System.out.print("Enter number of items: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        sc.nextLine();
                        System.out.print("Item name: ");
                        String item = sc.nextLine();
                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();
                        c.addItem(item, qty);
                    }

                    market.addCustomer(c);
                    break;

                case 2:
                    market.processCustomer();
                    break;

                case 3:
                    market.showStock();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

