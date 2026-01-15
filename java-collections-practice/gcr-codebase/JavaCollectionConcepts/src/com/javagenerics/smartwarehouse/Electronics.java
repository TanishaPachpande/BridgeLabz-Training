package com.javagenerics.smartwarehouse;

class Electronics extends WarehouseItem {
    private int warrantyYears;

    public Electronics(String name, int quantity, int warrantyYears) {
        super(name, quantity);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + getName()
                + ", Quantity: " + getQuantity()
                + ", Warranty: " + warrantyYears + " years");
    }
}

