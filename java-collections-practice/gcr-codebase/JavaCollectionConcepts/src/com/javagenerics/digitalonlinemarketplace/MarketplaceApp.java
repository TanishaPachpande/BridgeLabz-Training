package com.javagenerics.digitalonlinemarketplace;

import java.util.Scanner;

public class MarketplaceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductCatalog catalog = new ProductCatalog();

        int choice;

        do {
            System.out.println("\n===== ONLINE MARKETPLACE =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Gadget");
            System.out.println("4. Show Catalog");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter Book Price: ");
                    double bookPrice = sc.nextDouble();

                    Product<BookCategory> book =
                            new Product<>(bookName, bookPrice, new BookCategory());

                    System.out.print("Enter discount %: ");
                    double bookDiscount = sc.nextDouble();
                    DiscountUtil.applyDiscount(book, bookDiscount);

                    catalog.addProduct(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Clothing Name: ");
                    String clothName = sc.nextLine();

                    System.out.print("Enter Clothing Price: ");
                    double clothPrice = sc.nextDouble();

                    Product<ClothingCategory> clothing =
                            new Product<>(clothName, clothPrice, new ClothingCategory());

                    System.out.print("Enter discount %: ");
                    double clothDiscount = sc.nextDouble();
                    DiscountUtil.applyDiscount(clothing, clothDiscount);

                    catalog.addProduct(clothing);
                    System.out.println("Clothing added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Gadget Name: ");
                    String gadgetName = sc.nextLine();

                    System.out.print("Enter Gadget Price: ");
                    double gadgetPrice = sc.nextDouble();

                    Product<GadgetCategory> gadget =
                            new Product<>(gadgetName, gadgetPrice, new GadgetCategory());

                    System.out.print("Enter discount %: ");
                    double gadgetDiscount = sc.nextDouble();
                    DiscountUtil.applyDiscount(gadget, gadgetDiscount);

                    catalog.addProduct(gadget);
                    System.out.println("Gadget added successfully!");
                    break;

                case 4:
                    catalog.showCatalog();
                    break;

                case 5:
                    System.out.println("Thank you for using the Marketplace!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

