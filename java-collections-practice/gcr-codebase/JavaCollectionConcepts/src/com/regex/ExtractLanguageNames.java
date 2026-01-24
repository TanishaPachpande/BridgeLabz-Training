package com.regex;

import java.util.Scanner;

public class ExtractLanguageNames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Input: ");
		String input = sc.nextLine().toLowerCase();
		
		String[] languagesList = {"java", "javascript", "python", "go"};
		
		for(String word: languagesList) {
			if(input.contains(word)) {
				System.out.print(word+", ");
			}
		}
	}
}
