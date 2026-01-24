package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String input = "Contact us at support@example.com and info@company.org";
		
		String regex = "[a-z]+@[a-z]+\\.[a-z]{2,}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		sc.close();
	}
}
