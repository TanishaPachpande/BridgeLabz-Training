package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLicense {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String regex = "^[A-Z]{2}[0-9]{4}";
		
		System.out.print("Enter Input: ");
		String input = sc.nextLine();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(matcher.matches());
		
		sc.close();
	}
}
