package com.inheritance.multilevel.OnlineRetailOrderManagement;

public class Main {

	public static void main(String[] args) {
		Order order = new Order("ORD101", "01-01-2025");
        Order shippedOrder = new ShippedOrder("ORD102", "02-01-2025", "TRK12345");
        Order deliveredOrder = new DeliveredOrder("ORD103", "03-01-2025", "TRK67890", "05-01-2025");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());

	}

}
