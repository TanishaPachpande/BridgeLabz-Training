package com.constructors.level1;

public class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment when a product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method
    public static void displayTotalProducts(){
        System.out.println("Total Products Created: " + totalProducts);
    }
    
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        p1.displayProductDetails();
        System.out.println();

        Product p2 = new Product("Mobile", 25000);
        p2.displayProductDetails();
        System.out.println();

        Product p3 = new Product("Headphones", 2000);
        p3.displayProductDetails();
        System.out.println();

        // Calling class method using class name
        Product.displayTotalProducts();
    }
}
