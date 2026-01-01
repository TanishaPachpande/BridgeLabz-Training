package com.encapsulation_polymorphism.OnlineFoodDeliverySystem;

public class Main {

    public static void main(String[] args) {

        FoodItem veg = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        OrderProcessor.processOrder(veg);
        OrderProcessor.processOrder(nonVeg);
    }
}

