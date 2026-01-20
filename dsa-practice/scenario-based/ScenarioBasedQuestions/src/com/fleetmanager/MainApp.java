package com.fleetmanager;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle v= null;
		MasterList list = new MasterList();
		
		do {
		System.out.println("1. Add vehicle");
		System.out.println("2. Display vehicles");
		System.out.println("3. Exit");
		
		System.out.print("Enter choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter vehicle number:");
			int number = sc.nextInt();
			System.out.print("Enter Mileage:");
			int mileage=sc.nextInt();
			v=new Vehicle(number, mileage);
			list.addVehicle(v);
			break;
		case 2:
			list.display();
		case 3:
			System.out.println("END");
			return;
		default:
			System.out.println("Invalid input");
		}
		}while(true);
	}
}
