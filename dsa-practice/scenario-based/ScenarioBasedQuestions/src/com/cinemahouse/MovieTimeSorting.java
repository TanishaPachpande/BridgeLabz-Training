package com.cinemahouse;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTimeSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> timings = new ArrayList<>();
		
		do {
		System.out.println("1. Add timing");
		System.out.println("2. Display");
		System.out.println("3. Exit");
		
		System.out.print("Enter Choice:");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.print("Enter timing:");
			int time = sc.nextInt();
			timings.add(time);
			
			int n = timings.size();
			
			for(int i=0; i<n-1; i++) {
				boolean isSwapped=false;
				for(int j=0; j<n-1; j++) {
					if(timings.get(j)>timings.get(j+1)) {
						int temp = timings.get(j);
						timings.set(j, timings.get(j + 1));
			            timings.set(j + 1, temp);
						isSwapped=true;
					}
				}
				if(!isSwapped) {
					break;
				}
			}
			
			break;
		case 2:
			for(int t: timings) {
				System.out.print(t+" ");
			}
			System.out.println();
			break;
		case 3:
			System.out.println("END");
			return;
		default:
			System.out.println("Invalid Choice");
		}
		}while(true);
		
	}
}
