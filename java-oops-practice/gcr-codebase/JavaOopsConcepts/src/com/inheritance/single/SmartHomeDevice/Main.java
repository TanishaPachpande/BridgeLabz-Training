package com.inheritance.single.SmartHomeDevice;

public class Main {

	public static void main(String[] args) {
		Thermostat thermostat = new Thermostat("TH-101", true, 24);

        thermostat.displayStatus();
	}

}
