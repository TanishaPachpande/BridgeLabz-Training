package com.sophiaseatnumbers;

import java.util.Scanner;

public class SeatNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Booking ID");
		String s = sc.next();
		
		if(s.length()!=10) {
			System.out.println("Invalid Input");
		}else {
			char sixth = s.charAt(5);
			char seventh = s.charAt(6);
			int count = Integer.parseInt(sixth+""+seventh);
			
			if(!Character.isDigit(sixth) || !Character.isDigit(seventh)) {
				System.out.println("Invalid Count");
			}else if(count<1 || count>10) {
				System.out.println("Invalid Count");
			}else {
				char eight=s.charAt(7);
				char nine=s.charAt(8);
				char ten=s.charAt(9);
				
				
				if(!Character.isLetter(eight) || !Character.isDigit(nine) || !Character.isDigit(ten)) {
					System.out.println("Invalid Seat");
				}else {
					int seatNo = Integer.parseInt(nine+""+ten);
					for(int i=1;i<=count;i++) {
						System.out.println(eight+""+(seatNo++));
					}
				}
			}
		}
		
		
		sc.close();
	}
}
