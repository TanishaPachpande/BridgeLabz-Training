package com.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		
		String message = "Java is a Programming language";
		int limit=20;
		
		Function<String, Integer> f = (msg)-> msg.length();
		BiPredicate<Integer, Integer> bp = (len, lim)-> len>lim;
		
		int length = f.apply(message);
		
		if(bp.test(length, limit)) {
			System.out.println("Limit Exceeded!");
		}
		else {
			System.out.println("Within Limit.");
		}
		
	}
}
