package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
		
		sc.close();
	}
}
