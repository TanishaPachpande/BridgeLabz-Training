package com.encapsulation_polymorphism.VehicleRentalSystem;

public abstract class Vehicle implements Insurable {
	private int vehicleNumber;
	private String type;
	private int rentalRate;
	
	public Vehicle(int vehicleNumber, String type, int rentalRate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(int rentalRate) {
		this.rentalRate = rentalRate;
	}

	public abstract int calculateRentalCost(int days);
	
}
