package com.encapsulation_polymorphism.RideHailingApp;

public class Main {

	public static void main(String[] args) {
		Vehicle c = new Car(1, "xyz", 5);
		Vehicle b = new Bike(1, "abc", 2);
		Vehicle a = new Auto(3, "jkl", 10);
		
		c.getVehicleDetails();
		c.calculateFare(10);
		System.out.println("------------------------------------");
		b.getVehicleDetails();
		b.calculateFare(12);
		System.out.println("------------------------------------");
		a.getVehicleDetails();
		a.calculateFare(15);
		System.out.println("------------------------------------");
		
		c.updateLocation("bhopal");
		System.out.println(c.getCurrentLocation());
	}
}
