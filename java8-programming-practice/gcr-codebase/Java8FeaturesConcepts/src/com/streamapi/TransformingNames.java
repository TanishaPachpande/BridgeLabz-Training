package com.streamapi;

import java.util.ArrayList;
import java.util.List;

public class TransformingNames {
	public static void main(String[] args) {
		List<String> customers = List.of("Tanisha", "Aditya", "Harsh", "Vibha", "Namrata");
		
		customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
