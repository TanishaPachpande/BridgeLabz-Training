package com.functionalinterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
	
	static double threshold = 40.5; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Celsius");
		double temperature = sc.nextDouble();
		
		Predicate<Double> tempAlert = (temp) -> temp > threshold;
		
		if(tempAlert.test(temperature)) {
			System.out.println("ALERT!!");
		}else {
			System.out.println("Temperature is Normal.");
		}
	}
}
