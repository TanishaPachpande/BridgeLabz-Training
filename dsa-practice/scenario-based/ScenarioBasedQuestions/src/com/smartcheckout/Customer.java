package com.smartcheckout;

import java.util.HashMap;

public class Customer {

    private String name;
    private HashMap<String, Integer> items; // itemName -> quantity

    public Customer(String name) {
        this.name = name;
        this.items = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(String item, int qty) {
        items.put(item, items.getOrDefault(item, 0) + qty);
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }
}

