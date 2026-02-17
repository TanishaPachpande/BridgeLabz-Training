package com.lexicaltwist;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LexicalTwist {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first word");
		String s1=sc.nextLine();
		try {
		if(s1.contains(" ")) {
			throw new InvalidWordException(s1+" is an invalid word");
		}
		System.out.println("Enter the second word");
		String s2=sc.next();
		
		if(isReverse(s1, s2)) {
			String transformedWord = replaceVowels(s2.toLowerCase());
			System.out.println(transformedWord);
			
		}else {
			Set<Character> vowelSet = new LinkedHashSet<>();
			Set<Character> consonantSet= new LinkedHashSet<>();
			int vowels=0, consonants=0;
			String combined = s1+s2;
			combined=combined.toUpperCase();
			for(char ch: combined.toCharArray()) {
				if("AEIOU".indexOf(ch)!=-1) {
					vowelSet.add(ch);
					vowels++;
				}else {
					consonantSet.add(ch);
					consonants++;
				}
			}
			if(vowels>consonants) {
				int i=0;
				for(char ch: vowelSet) {
					if(i<2) {
						System.out.print(ch);
					}
					i++;
				}
			}else if(vowels<consonants) {
				int i=0;
				for(char ch: consonantSet) {
					if(i<2) {
						System.out.print(ch);
					}
					i++;
				}
			}else {
				System.out.println("Vowels and consonants are equal");
			}
		}
		}catch(InvalidWordException e) {
			System.out.println(e);
		}
	}
	
	public static boolean isReverse(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		String rev = sb.reverse().toString();
		if(rev.equalsIgnoreCase(s2)) {
			return true;
		}
		return false;
	}
	
	public static String replaceVowels(String s2) {
		String res = "";
		for(char ch: s2.toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) {
				res+="@";
			}else {
				res+=ch;
			}
		}
		return res;
	}
}
