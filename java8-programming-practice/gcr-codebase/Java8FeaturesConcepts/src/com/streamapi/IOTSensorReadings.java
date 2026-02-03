package com.streamapi;

import java.util.List;
import java.util.function.Predicate;

public class IOTSensorReadings {
	public static void main(String[] args) {
		
		List<Number> readings = List.of(20.5, 50.2, 45, 27.9);
		
		Predicate<Number> checkReadings = (x) -> x.doubleValue() > 35.5;
		
		readings.stream().filter(checkReadings).forEach(System.out::println);
	}
}
