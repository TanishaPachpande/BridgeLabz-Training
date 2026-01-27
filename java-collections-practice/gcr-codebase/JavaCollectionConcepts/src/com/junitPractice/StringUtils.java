package com.junit;

public class StringUtils {
	
	String reverse(String str) {
		if(str==null || str=="") {
			return null;
		}
		
		return new StringBuilder(str).reverse().toString();
	}
	
	boolean isPalindrome(String str) {
		if(str==null || str=="") {
			return false;
		}
		
		return str.equals(reverse(str));
	}
	
	String convertToUpperCase(String str) {
		return str.toUpperCase();
	}
}
