package com.inheritance.hybrid.VehicleManagementSystem;

public class PetrolVehicle extends Vehicle implements Refuelable{
	PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}
