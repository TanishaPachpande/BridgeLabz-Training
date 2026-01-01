package com.inheritance.hierarchical.VehicleTransportSystem;

class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
