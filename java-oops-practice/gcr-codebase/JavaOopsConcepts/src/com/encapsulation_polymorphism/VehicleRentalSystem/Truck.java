package com.encapsulation_polymorphism.VehicleRentalSystem;

public class Truck extends Vehicle{
	
	public Truck(int vehicleNumber, String type, int rentalRate) {
		super(vehicleNumber, type, rentalRate);
	}

	public int calculateRentalCost(int days) {
		return (days*getRentalRate());
	}
	
    public int calculateInsurance() {
		return 900;
	}
	public void getInsuranceDetails() {
		System.out.println("Bike Insurance: "+ calculateInsurance());
	}
}
