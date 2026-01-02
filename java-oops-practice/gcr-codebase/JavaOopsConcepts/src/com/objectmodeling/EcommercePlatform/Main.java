package com.objectmodeling.EcommercePlatform;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Tanisha");

        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mouse", 500);
        Product p3 = new Product(103, "Keyboard", 1500);

        Order order1 = new Order(1001);

        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        customer.placeOrder(order1);
        customer.showOrders();
    }
}

