package com.objectmodeling.EcommercePlatform;

import java.util.ArrayList;

class Customer {
    private int customerId;
    private String customerName;
    private ArrayList<Order> orders;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Communication method
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed Order ID: " + order);
    }

    public void showOrders() {
        System.out.println("\nCustomer: " + customerName);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
