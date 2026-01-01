package com.inheritance.hybrid.RestaurantManagementSystem;

public class Waiter extends Person implements Worker {

    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Waiter is serving " + tableCount + " tables.");
    }
}

