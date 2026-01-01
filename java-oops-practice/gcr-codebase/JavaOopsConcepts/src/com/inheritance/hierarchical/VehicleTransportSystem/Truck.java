package com.inheritance.hierarchical.VehicleTransportSystem;

class Truck extends Vehicle {
    private int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        System.out.println("Vehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("--------------------------");
    }
}
