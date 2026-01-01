package com.inheritance.single.SmartHomeDevice;

public class Device {
	protected String deviceId;
	protected boolean status;
	
	Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
