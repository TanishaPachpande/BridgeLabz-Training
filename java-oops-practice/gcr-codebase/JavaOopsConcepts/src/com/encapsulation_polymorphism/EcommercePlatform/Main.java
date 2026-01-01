package com.encapsulation_polymorphism.EcommercePlatform;

public class Main {

	public static void calculateFinalPrice(Product product) {
        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            tax = taxable.calculateTax();
            System.out.println(taxable.getTaxDetails());
        } else {
            System.out.println("No tax applicable");
        }

        double finalPrice = price + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 3000);
        Product p3 = new Groceries(103, "Rice Bag", 1200);

        calculateFinalPrice(p1);
        calculateFinalPrice(p2);
        calculateFinalPrice(p3);
    }
}
