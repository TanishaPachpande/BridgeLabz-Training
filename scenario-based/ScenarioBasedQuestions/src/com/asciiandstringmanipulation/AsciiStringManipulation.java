package com.asciiandstringmanipulation;

import java.util.Scanner;

public class AsciiStringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Input: ");
		String input= sc.nextLine();
		
		String result = cleanseAndInvert(input);
		if(!result.isEmpty()){
			System.out.println("The generated key is - "+ result);
		}else {
			System.out.println("Invalid Input");
		}
	}
	
	public static String cleanseAndInvert(String input) {
		input=input.toLowerCase();
		
		if(input==null || input.length()<6 || input.contains(" ")) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			char ch=input.charAt(i);
			if(Character.isDigit(ch) || !Character.isLetter(ch)) {
				return "";
			}
			
			if(((int)ch)%2!=0) {
				sb.append((char)ch);
			}
		}
		
		String reversedString = sb.reverse().toString();
		String result = "";
		
		for(int i=0;i<reversedString.length();i++) {
			char ch = reversedString.charAt(i);
			if(i%2==0) {
				result+=Character.toUpperCase(ch);
			}else {
				result+=ch;
			}
		}
		
		return result;
		
	}
}
