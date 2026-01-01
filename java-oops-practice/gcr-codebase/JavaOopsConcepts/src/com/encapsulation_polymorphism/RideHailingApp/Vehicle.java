package com.encapsulation_polymorphism.RideHailingApp;

public abstract class Vehicle implements GPS {
	private int vehicleId;
	private String driverName;
	private int ratePerKm;
	
	private String currentLocation;
	

	public int getRatePerKm() {
		return ratePerKm;
	}

	public Vehicle(int vehicleId, String driverName, int ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}
	
	public abstract double calculateFare(double distance); 
	
	public void getVehicleDetails() {
		System.out.println("Vehicle ID: "+vehicleId);
		System.out.println("Driver Name: "+ driverName);
		System.out.println("Rate Per Km: "+ratePerKm);
	}
	
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	public String getCurrentLocation() {
		return currentLocation;
	}

	public void updateLocation(String location) {
		this.currentLocation=location;
	}
}
