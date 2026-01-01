package com.inheritance.hybrid.VehicleManagementSystem;

public class Main {

	public static void main(String[] args) {
		ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);
        ev.displayInfo();
        ev.charge();

        System.out.println("--------------------------");

        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);
        pv.displayInfo();
        pv.refuel();
	}
}
