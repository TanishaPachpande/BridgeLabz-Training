package com.exception;

import java.util.Scanner;

public class ThrowThrows {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.print("Enter Amount:");
			double amount = sc.nextDouble();
			System.out.print("Enter Rate:");
			double rate = sc.nextDouble();
			System.out.print("Enter Years:");
			int years = sc.nextInt();
			
			System.out.println(calculateInterest(amount, rate, years));
			
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}
		
	}
	
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
		
		if(amount<0 || rate<0) {
			throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		}
		double interest = (amount*rate*years)/100;
		return interest;
	
		
	}
}
