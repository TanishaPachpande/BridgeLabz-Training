package com.encapsulation_polymorphism.VehicleRentalSystem;

public class Bike extends Vehicle{

	public Bike(int vehicleNumber, String type, int rentalRate) {
		super(vehicleNumber, type, rentalRate);
	}
	
	public int calculateRentalCost(int days) {
		return (days*getRentalRate());
	}
	
    public int calculateInsurance() {
		return 550;
	}
    
	public void getInsuranceDetails() {
		System.out.println("Bike Insurance: "+ calculateInsurance());
	}
}
