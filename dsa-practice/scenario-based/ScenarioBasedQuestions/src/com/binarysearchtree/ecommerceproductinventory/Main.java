package com.binarysearchtree.ecommerceproductinventory;

public class Main {
    public static void main(String[] args) {

        ProductBST inventory = new ProductBST();

        // 🔹 Scenario 1: Insert Products
        inventory.root = inventory.insert(inventory.root, 1005, 999.99);
        inventory.insert(inventory.root, 1001, 499.50);
        inventory.insert(inventory.root, 1008, 1499.00);
        inventory.insert(inventory.root, 1003, 799.00);

        // 🔹 Scenario 1: Lookup
        System.out.println("Searching for SKU 1003:");
        ProductNode product = inventory.search(inventory.root, 1003);
        if (product != null) {
            System.out.println("Product Found | Price: ₹" + product.price);
        } else {
            System.out.println("Product not found");
        }

        // 🔹 Scenario 2: Price Update
        inventory.updatePrice(1003, 850.00);

        // 🔹 Scenario 3: Sorted Product List
        System.out.println("\nProducts in Sorted SKU Order:");
        inventory.inorder(inventory.root);
    }
}

