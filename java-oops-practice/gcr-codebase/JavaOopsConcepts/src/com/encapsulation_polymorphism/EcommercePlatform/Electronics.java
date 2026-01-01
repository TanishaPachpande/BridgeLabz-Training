package com.encapsulation_polymorphism.EcommercePlatform;

public class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

