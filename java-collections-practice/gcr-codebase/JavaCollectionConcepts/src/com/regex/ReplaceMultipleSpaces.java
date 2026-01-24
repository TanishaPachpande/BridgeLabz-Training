package com.regex;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter input: ");
		String input=sc.nextLine();
		
		String result = input.replaceAll("\\s+", " ");
		System.out.println(result);
		
		sc.close();
	}
}
