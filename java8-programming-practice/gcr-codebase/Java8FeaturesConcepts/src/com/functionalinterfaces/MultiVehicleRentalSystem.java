package com.functionalinterfaces;

@FunctionalInterface
interface Vehicle{
	void performOperation();
}

public class MultiVehicleRentalSystem {
	public static void main(String[] args) {
		Vehicle carRent = ()-> System.out.println("Car taken on rent");
		Vehicle bikeRent = ()-> System.out.println("Bike taken on rent");
		Vehicle busRent = ()-> System.out.println("Bus taken on rent");
		
		Vehicle carReturn = ()-> System.out.println("Car returned");
		Vehicle bikeReturn = ()-> System.out.println("Bike returned");
		Vehicle busReturn = ()-> System.out.println("Bus returned");
		
		execute(carRent);
		execute(bikeRent);
		execute(busRent);
		
		execute(carReturn);
		execute(bikeReturn);
		execute(busReturn);
	}
	
	static void execute(Vehicle v) {
		v.performOperation();
	}
}
