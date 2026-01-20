package com.artexpo;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Artist a = null;
		ArtistList l = new ArtistList();
		
		do {
		System.out.println("----------------------------------------------------");
		System.out.println("1. Add Artist");
		System.out.println("2. Display Artist and Registration time");
		System.out.println("3. Exit");
		
		System.out.print("Enter choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter Artist Name:");
			String name= sc.next();
			System.out.print("Enter Registration Time");
			long time=sc.nextLong();
			a = new Artist(name, time);
			l.addArtist(a);
			break;
		case 2:
			l.display();
			break;
		case 3:
			System.out.println("END");
			return;
		default:
			System.out.println("Invalid Input");
		}
		}while(true);
	}
}
