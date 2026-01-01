package com.encapsulation_polymorphism.OnlineFoodDeliverySystem;

class VegItem extends FoodItem {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}

