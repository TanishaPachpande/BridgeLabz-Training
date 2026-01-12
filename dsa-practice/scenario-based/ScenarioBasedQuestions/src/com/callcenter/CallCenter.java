package com.callcenter;

import java.util.*;

class Customer {
    String name;
    boolean isVIP;

    Customer(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }
}

public class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();
    PriorityQueue<Customer> vipQueue = new PriorityQueue<>(
            (a, b) -> Boolean.compare(b.isVIP, a.isVIP)
    );
    HashMap<String, Integer> callCount = new HashMap<>();

    // Add incoming call
    void receiveCall(Customer customer) {

        // Update call count
        callCount.put(customer.name,
                callCount.getOrDefault(customer.name, 0) + 1);

        // Add to appropriate queue
        if (customer.isVIP) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        System.out.println("Call received from: " + customer.name);
    }

    // Serve calls
    void handleCall() {
        if (!vipQueue.isEmpty()) {
            Customer c = vipQueue.poll();
            System.out.println("Serving VIP customer: " + c.name);
        } else if (!normalQueue.isEmpty()) {
            Customer c = normalQueue.poll();
            System.out.println("Serving normal customer: " + c.name);
        } else {
            System.out.println("No calls in queue");
        }
    }

    public static void main(String[] args) {
        CallCenter center = new CallCenter();

        center.receiveCall(new Customer("Amit", false));
        center.receiveCall(new Customer("Riya", true));
        center.receiveCall(new Customer("Neha", false));
        center.receiveCall(new Customer("Riya", true));

        center.handleCall();
        center.handleCall();
        center.handleCall();
        center.handleCall();

        System.out.println("\nMonthly Call Count:");
        System.out.println(center.callCount);
    }
}

