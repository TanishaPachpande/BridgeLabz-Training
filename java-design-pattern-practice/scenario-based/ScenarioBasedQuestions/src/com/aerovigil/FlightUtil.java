package com.aerovigil;

import java.util.HashMap;
import java.util.Map;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		String regex = "FL-[1-9][0-9]{3}";
		
		if(!flightNumber.matches(regex)) {
			throw new InvalidFlightException("The flight number "+ flightNumber+" is invalid");
		}
		return true;
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException {
		String[] flights = {"SpiceJet","Vistara","IndiGo","Air Arabia"};
		boolean found=false;
		for(String f: flights) {
			if(f.equals(flightName)) {
				found=true;
				break;
			}
		}
		if(!found) {
			throw new InvalidFlightException("The flight name "+ flightName+" is invalid"); 
		}
		return found;
	}
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		Map<String, Integer> passengerCapacity = new HashMap<>();
		passengerCapacity.put("SpiceJet", 396);
		passengerCapacity.put("Vistara", 615);
		passengerCapacity.put("IndiGo", 230);
		passengerCapacity.put("Air Arabia", 130);
		
		if(passengerCount>passengerCapacity.get(flightName)) {
			throw new InvalidFlightException("The passenger count "+ passengerCount+ " is invalid for "+flightName);
		}
		return true;
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		Map<String, Integer> tankCapacity = new HashMap<>();
		tankCapacity.put("SpiceJet", 200000);
		tankCapacity.put("Vistara", 300000);
		tankCapacity.put("IndiGo", 250000);
		tankCapacity.put("Air Arabia", 150000);
		
		if(currentFuelLevel<0 || currentFuelLevel>tankCapacity.get(flightName)) {
			throw new InvalidFlightException("Invalid fuel level for "+ flightName);
		}
		double toBeFilled = tankCapacity.get(flightName)-currentFuelLevel;
		return toBeFilled;
	}
}