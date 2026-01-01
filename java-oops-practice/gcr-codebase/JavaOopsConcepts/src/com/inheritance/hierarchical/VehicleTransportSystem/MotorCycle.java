package com.inheritance.hierarchical.VehicleTransportSystem;

class MotorCycle extends Vehicle {
    private boolean hasGear;

    MotorCycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    void displayInfo() {
        System.out.println("Vehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
        System.out.println("--------------------------");
    }
}


