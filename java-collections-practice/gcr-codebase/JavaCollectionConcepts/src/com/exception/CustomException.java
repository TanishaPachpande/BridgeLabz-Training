package com.exception;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter Age:");
			int age=sc.nextInt();
			
			{
				if(checkAge(age)) {
					System.out.println("Access granted!");
				}else {  
					throw new InvalidAgeException("Age must be 18 or above");
				}
			}
			
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
	
	public static boolean checkAge(int age) {
		if(age>=18) {
			return true;
		}else {  
			return false;
		}
	}
}
