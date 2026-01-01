package com.inheritance.multilevel.OnlineRetailOrderManagement;

public class ShippedOrder extends Order{
	protected String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}
