package com.regex;

import java.util.Scanner;

public class ValidCreditCardNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    String visaCardRegex = "4+[0-9]{15}";
	    String masterCardRegex = "5+[0-9]{15}";
		
		System.out.print("Enter Input: ");
		String input = sc.nextLine();
		
		if(input.matches(masterCardRegex)) {
			System.out.println("It is a Master Card Number");
		}else if(input.matches(visaCardRegex)) {
			System.out.println("It is a Visa Card Number");
		}else {
			System.out.println("Invalid Card Number");
		}
	}
}
