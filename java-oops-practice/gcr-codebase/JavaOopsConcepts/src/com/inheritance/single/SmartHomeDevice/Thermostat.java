package com.inheritance.single.SmartHomeDevice;

public class Thermostat extends Device {
	private int temperatureSetting;
	
	Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device Type: Thermostat");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("--------------------------");
    }
}
