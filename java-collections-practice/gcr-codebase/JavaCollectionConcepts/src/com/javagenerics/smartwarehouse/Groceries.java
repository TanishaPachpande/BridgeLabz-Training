package com.javagenerics.smartwarehouse;

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, int quantity, String expiryDate) {
        super(name, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries: " + getName()
                + ", Quantity: " + getQuantity()
                + ", Expiry: " + expiryDate);
    }
}

