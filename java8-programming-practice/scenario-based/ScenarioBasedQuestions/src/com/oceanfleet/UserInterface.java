package com.oceanfleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		VesselUtil util = new VesselUtil();
		System.out.println("Enter the number of vessels to be added");
	    int n=sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println("Enter vessel details");
	    for(int i=1; i<=n; i++) {
	    	String vesselDetail = sc.nextLine();
	    	String[] arr= vesselDetail.split(":");
	    	String vesselId=arr[0];
	    	String vesselName = arr[1];
	    	double averageSpeed = Double.parseDouble(arr[2]);
	    	String vesselType = arr[3];
	    	Vessel vessel = new Vessel(vesselId, vesselName, averageSpeed, vesselType);
	    	util.addVesselPerformance(vessel);
	    }
		
	    System.out.println("Enter vessel Id to check speed");
	    String vesselId = sc.next();
	    
	    Vessel vesselById = util.getVesselById(vesselId);
	    if(vesselById!=null) {
	        System.out.println(vesselById.toString());
	    }else {
	    	System.out.println("Vessel Id "+ vesselById+ " not found");
	    }
	    
	    System.out.println("High Performance vessels are");
	    List<Vessel> highPerformance = util.getHighPerformanceVessels();	
	    for(Vessel v: highPerformance) {
	    	System.out.println(v.toString());
	    }
	}
}
