package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class HospitalPatientIDPrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> ids = List.of(1, 203, 14, 101);
		
		ids.stream().forEach(System.out::println);
	}
}