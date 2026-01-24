package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String regex = "https?://www\\.[a-z]+\\.[a-z]{2,}";
		String input = "Visit https://www.google.com and http://example.org for more info.";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
