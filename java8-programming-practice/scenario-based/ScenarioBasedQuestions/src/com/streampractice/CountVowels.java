package com.streampractice;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		long vowelCount = s.chars().filter(c->"aeiouAEIOU".indexOf(c)!=-1).count();
		System.out.println(vowelCount);
	}
}
