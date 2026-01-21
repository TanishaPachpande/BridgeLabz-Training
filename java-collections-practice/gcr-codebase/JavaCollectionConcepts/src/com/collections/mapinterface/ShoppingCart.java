package com.collections.mapinterface;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        // Main storage
        Map<String, Integer> priceMap = new HashMap<>();

        // Maintain insertion order
        Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Display Products (Insertion Order)");
            System.out.println("3. Display Products (Sorted by Price)");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product Name: ");
                    String name = sc.next();

                    System.out.print("Enter Product Price: ");
                    int price = sc.nextInt();

                    priceMap.put(name, price);
                    insertionOrderMap.put(name, price);

                    System.out.println("Product added!");
                    break;

                case 2:
                    System.out.println("Products in insertion order:");
                    insertionOrderMap.forEach(
                        (k, v) -> System.out.println(k + " → " + v)
                    );
                    break;

                case 3:
                    // TreeMap to sort by price
                    TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();

                    for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
                        sortedByPrice
                            .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                            .add(entry.getKey());
                    }

                    System.out.println("Products sorted by price:");
                    for (Map.Entry<Integer, List<String>> entry : sortedByPrice.entrySet()) {
                        System.out.println("Price " + entry.getKey() + " → " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("END");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
