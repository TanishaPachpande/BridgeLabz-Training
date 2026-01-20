package com.robowarehouse;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PackageShelf shelf = new PackageShelf();
		
		do {
		System.out.println("1. Add Package");
		System.out.println("2. Display Packages");
		System.out.println("3. Exit");
		
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter weight for package:");
			int weight=sc.nextInt();
			shelf.addPackage(weight);
			break;
		case 2:
			shelf.display();
			break;
		case 3:
			System.out.println("END");
			return;
		default:
			System.out.println("Invalid choice");
		}
		} while(true);
	}
}
