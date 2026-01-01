package com.encapsulation_polymorphism.RideHailingApp;

public class Auto extends Vehicle{

	public Auto(int vehicleId, String driverName, int ratePerKm) {
		super(vehicleId, driverName, ratePerKm);
	}
	
	public double calculateFare(double distance) {
		return distance*getRatePerKm();
	}

	public void updateLocation() {
		String currentLocation=getCurrentLocation();
		System.out.println(currentLocation);
	}

}
