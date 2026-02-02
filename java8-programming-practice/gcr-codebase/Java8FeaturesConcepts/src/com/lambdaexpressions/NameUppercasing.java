package com.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class NameUppercasing {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Adi", "Tanu", "Harsh", "Vibha", "Ayush");
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
	
}
