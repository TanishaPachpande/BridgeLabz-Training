package com.encapsulation_polymorphism.VehicleRentalSystem;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		
		Vehicle v1 = new Bike(1, "bike", 100);
		
		Vehicle v2 = new Car(2, "car", 200);
		
		Vehicle v3 = new Truck(3, "truck", 300);
		
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		
		// Polymorphic behavior
		for (Vehicle v : vehicles) {
			System.out.print("The Rental Cost is ");
			System.out.println(v.calculateRentalCost(5));
			System.out.print("Your Insurance Details: ");
		    v.getInsuranceDetails();
		    System.out.println("--------------------------------------------------");
		}
	}
}


