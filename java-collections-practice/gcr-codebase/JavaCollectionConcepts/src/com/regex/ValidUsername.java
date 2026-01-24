package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter input: ");
		String input = sc.nextLine();
		
		String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(matcher.matches());
	}
}
