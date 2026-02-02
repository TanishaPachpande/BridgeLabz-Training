package com.functionalinterfaces;

import java.util.Scanner;

interface Conversion{
	void convert(int km, int kg); 
	
	static Conversion getConvertor() {
	    return (km, kg) -> {
	        System.out.println("KM in miles are: " + (km * 0.621));
	        System.out.println("KG in lbs are: " + (kg * 2.2));
	    };
	}
}

public class UnitConversionTool {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter KM: ");
		int km = sc.nextInt();
		
		System.out.println("Enter KG: ");
		int kg=sc.nextInt();
		
		Conversion c = Conversion.getConvertor();
		
		c.convert(km, kg);
	}
}


