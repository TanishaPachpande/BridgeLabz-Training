package com.javagenerics.smartwarehouse;

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, int quantity, String material) {
        super(name, quantity);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture: " + getName()
                + ", Quantity: " + getQuantity()
                + ", Material: " + material);
    }
}



