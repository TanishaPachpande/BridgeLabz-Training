package com.encapsulation_polymorphism.OnlineFoodDeliverySystem;

class NonVegItem extends FoodItem {

    private static final double NON_VEG_CHARGE = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    public String getDiscountDetails() {
        return "5% discount + ₹50 non-veg charge";
    }
}
