package com.oceanfleet;

public class Vessel {
	String vesselId;
	String vesselName;
	double averageSpeed;
	String vesselType;
	
	public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesselType = vesselType;
	}
	
	@Override
	public String toString() {
		return vesselId + " | " + vesselName + " | " + averageSpeed + " | " + vesselType;
	}
}
