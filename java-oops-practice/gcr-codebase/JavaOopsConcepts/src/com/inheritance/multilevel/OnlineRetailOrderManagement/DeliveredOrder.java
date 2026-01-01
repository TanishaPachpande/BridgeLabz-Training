package com.inheritance.multilevel.OnlineRetailOrderManagement;

public class DeliveredOrder extends ShippedOrder{
	
	private String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }

}
