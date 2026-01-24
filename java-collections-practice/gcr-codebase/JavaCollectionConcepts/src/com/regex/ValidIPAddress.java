package com.regex;

import java.util.Scanner;

public class ValidIPAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter input: ");
		String input = sc.nextLine();
		
		String regex = "(\\d{1,3}\\.){3}\\d{1,3}";
		
		if(input.matches(regex)) {
			System.out.println("Valid IP Address");
		}else {
			System.out.println("Invalid IP Address");
		}
	}
}
