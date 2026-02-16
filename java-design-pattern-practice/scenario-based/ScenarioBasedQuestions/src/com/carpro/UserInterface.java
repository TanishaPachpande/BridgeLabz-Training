package com.carpro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, LocalDate> bookings = new HashMap<>();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Enter number of bookings to be added");
		int n = sc.nextInt();
		sc.nextLine();
		if(n>0) {
			System.out.println("Enter the Booking details (Booking Id:Date of Booking)");
			for(int i=1;i<=n;i++){
				String s=sc.nextLine();
				String[] arr = s.split(":");
				String id = arr[0];
				LocalDate date = LocalDate.parse(arr[1], df);
				bookings.put(id, date);
			}
			
			BookCabMain bookCab = new BookCabMain(bookings);
			
			System.out.println("Enter the date to check the booking(yyyy-MM-dd)");
		
			LocalDate checkDate=LocalDate.parse(sc.next(), df);
			List<String> ids = bookCab.findCabBookingIdsForTheBookingDate(checkDate);
			
			if(ids.size()!=0){
				System.out.println("Booking Ids booked on the "+ checkDate+" are by");
				for(String i: ids) {
					System.out.println(i);
				}
			}else {
				System.out.println("No bookings were booked");
			}
				
		}else {
			System.out.println("You entered 0, means no bookings");
		}
		
		
		
		sc.close();
	}
}
