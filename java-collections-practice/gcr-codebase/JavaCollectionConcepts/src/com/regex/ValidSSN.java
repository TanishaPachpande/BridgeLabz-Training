package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidSSN {  // Social Security Network
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Input: ");
		String input = sc.nextLine();
		
		String regex = "\\b(\\d+-){2}\\d+\\b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if (matcher.find()) {
            System.out.println("\"" + matcher.group() + "\" is valid");
        } else {
            System.out.println("Invalid SSN");
        }
		
		sc.close();
	}
}
