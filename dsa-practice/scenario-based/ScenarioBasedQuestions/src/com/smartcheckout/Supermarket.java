package com.smartcheckout;
import java.util.*;

public class Supermarket {

    private Queue<Customer> checkoutQueue;
    private HashMap<String, Integer> priceMap;
    private HashMap<String, Integer> stockMap;

    public Supermarket() {
        checkoutQueue = new LinkedList<>();
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();

        // Initial items
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Rice", 60);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 20);
        stockMap.put("Rice", 15);
    }

    public void addCustomer(Customer c) {
        checkoutQueue.add(c);
        System.out.println(c.getName() + " added to queue.");
    }

    public void processCustomer() {
        if (checkoutQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer c = checkoutQueue.poll();
        System.out.println("\nBilling customer: " + c.getName());

        int total = 0;

        for (Map.Entry<String, Integer> entry : c.getItems().entrySet()) {
            String item = entry.getKey();
            int qty = entry.getValue();

            if (!priceMap.containsKey(item)) {
                System.out.println(item + " not available.");
                continue;
            }

            if (stockMap.get(item) < qty) {
                System.out.println("Not enough stock for " + item);
                continue;
            }

            int price = priceMap.get(item);
            total += price * qty;

            // Update stock
            stockMap.put(item, stockMap.get(item) - qty);
        }

        System.out.println("Total Bill: ₹" + total);
    }

    public void showStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }
}

