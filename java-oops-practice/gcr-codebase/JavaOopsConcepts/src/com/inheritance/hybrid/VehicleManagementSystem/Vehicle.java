package com.inheritance.hybrid.VehicleManagementSystem;

public class Vehicle {
	int maxSpeed;
	String model;
	
	Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
