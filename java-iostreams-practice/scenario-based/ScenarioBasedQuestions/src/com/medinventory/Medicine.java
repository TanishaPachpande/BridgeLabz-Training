package com.medinventory;

public class Medicine extends Item<String> {

    public Medicine(String itemId, String itemName, int quantity, String expiryDate) {
        super(itemId, itemName, quantity, expiryDate);
    }
}

