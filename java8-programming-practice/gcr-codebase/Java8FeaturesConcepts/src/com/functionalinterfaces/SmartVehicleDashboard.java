package com.functionalinterfaces;

@FunctionalInterface
interface Transport{
	void displaySpeed();
	
}

interface ElectricVehicle extends Transport {
    default void displayBattery() {
        System.out.println("Battery percentage displayed");
    }
}

public class SmartVehicleDashboard {
	public static void main(String[] args) {
		Transport petrolVehicleSpeed = () -> System.out.println("Speed of petrol vehicle: 40");
		Transport dieselVehicleSpeed = () -> System.out.println("Speed of diesel vehicle: 35");
//		Transport electricVehicleSpeed = () -> System.out.println("Speed of electric vehicle: 45");
		ElectricVehicle electric = () -> System.out.println("Speed of electric vehicle: 45");
		
		petrolVehicleSpeed.displaySpeed();
		dieselVehicleSpeed.displaySpeed();
		electric.displaySpeed();
		electric.displayBattery();
	}
}
