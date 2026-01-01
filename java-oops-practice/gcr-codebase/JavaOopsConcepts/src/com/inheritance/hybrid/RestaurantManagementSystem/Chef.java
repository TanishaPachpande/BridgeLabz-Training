package com.inheritance.hybrid.RestaurantManagementSystem;

public class Chef extends Person implements Worker {

    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public void performDuties() {
        System.out.println("Chef is cooking " + specialization + " dishes.");
    }
}
