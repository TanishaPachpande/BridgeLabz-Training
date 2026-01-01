package com.encapsulation_polymorphism.OnlineFoodDeliverySystem;

public class OrderProcessor {
	public static void processOrder(FoodItem item) {
        item.getItemDetails();

        double totalPrice = item.calculateTotalPrice();
        double discount = item.applyDiscount();

        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + (totalPrice - discount));
        System.out.println(item.getDiscountDetails());
        System.out.println("--------------------------------");
    }
}
