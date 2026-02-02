package com.functionalinterfaces;

@FunctionalInterface
interface Device{
	void perform();
}

public class SmartDeviceControl {
	public static void main(String[] args) {
		Device lightOn = () -> System.out.println("Light is on");
		Device lightOff = () -> System.out.println("Light is off");
		
		Device acOn= ()-> System.out.println("AC is on");
		Device acOff= ()-> System.out.println("AC is off");
		
		Device tvOn = ()-> System.out.println("Tv is on");
		Device tvOff = () -> System.out.println("Tv is off");
		
		execute(lightOn);
		execute(acOn);
		execute(tvOn);
		
		execute(lightOff);
		execute(acOff);
		execute(tvOff);
	}
	
	static void execute(Device action) {
		action.perform();
	}
}
