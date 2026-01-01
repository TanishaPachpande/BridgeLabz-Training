package com.encapsulation_polymorphism.VehicleRentalSystem;

public class Car extends Vehicle {

	public Car(int vehicleNumber, String type, int rentalRate) {
		super(vehicleNumber, type, rentalRate);
	}
	
	
	public int calculateRentalCost(int days) {
		return (days*getRentalRate());
	}
	
    public int calculateInsurance() {
		return 700;
	}
    
	public void getInsuranceDetails() {
		System.out.println("Bike Insurance: "+ calculateInsurance());
	}
	
}
