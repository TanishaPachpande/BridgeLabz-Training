package com.encapsulation_polymorphism.OnlineFoodDeliverySystem;

abstract class FoodItem implements Discountable {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Encapsulation (controlled access)
    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected String getItemName() {
        return itemName;
    }
}

