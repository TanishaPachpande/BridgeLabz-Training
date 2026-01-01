package com.inheritance.multilevel.OnlineRetailOrderManagement;

public class Order {
	protected String orderId;
	protected String orderDate;
	
	Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}
