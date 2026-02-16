package com.aerovigil;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) throws InvalidFlightException {
		Scanner sc = new Scanner(System.in);
		
		FlightUtil fu = new FlightUtil();
		System.out.println("Enter flight details");
		String s = sc.nextLine();
		
		String[] arr = s.split(":");
		String flightNumber = arr[0];
		String flightName=arr[1];
		int passengerCount = Integer.parseInt(arr[2]);
		double currentFuelLevel = Double.parseDouble(arr[3]);
		double fuelRequired = 0.0;
		
		try {
	    	boolean isValidFlightNumber= fu.validateFlightNumber(flightNumber);
	    	boolean isValidFlightName= fu.validateFlightName(flightName);
	    	boolean isValidPassengerCount= fu.validatePassengerCount(passengerCount, flightName);
	    	if(isValidFlightNumber && isValidFlightName && isValidPassengerCount) {
	    		fuelRequired = fu.calculateFuelToFillTank(flightName, currentFuelLevel);
	    	System.out.println("Fuel required to fill the tank: "+fuelRequired+ "liters");
	    	}
		}catch(InvalidFlightException e) {
			System.out.println(e);
		}
	}
}
