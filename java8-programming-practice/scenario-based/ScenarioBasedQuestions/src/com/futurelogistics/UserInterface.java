package com.futurelogistics;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Utility u = new Utility();
		System.out.println("Enter the Goods Transport details");
		String s = sc.nextLine();
		float totalCharge=0;
		
		try {
			GoodsTransport goodsTransport = u.parseDetails(s);
			String type = u.findObjectType(goodsTransport);
			
			totalCharge = goodsTransport.calculateTotalCharge();
			
			String[] arr = s.split(":");
			if(goodsTransport instanceof BrickTransport) {
				System.out.println("Transporter id: "+ arr[0]);
				System.out.println("Date of Transport: "+ arr[1]);
				System.out.println("Rating of the transport: "+ arr[2]);
				System.out.println("Quantity of bricks: "+ arr[5]);
				System.out.println("Brick Price: "+ arr[6]);
				System.out.println("Vehicle for transport: "+ goodsTransport.vehicleSelection());
				System.out.println("Total charge: "+ goodsTransport.calculateTotalCharge());
			}else if(goodsTransport instanceof TimberTransport){
				System.out.println("Transporter id: "+ arr[0]);
				System.out.println("Date of Transport: "+ arr[1]);
				System.out.println("Rating of the transport: "+ arr[2]);
				System.out.println("Type of the timber: "+ arr[6]);
				System.out.println("Timber price per kilo: "+ arr[7]);
				System.out.println("Vehicle for transport: "+ goodsTransport.vehicleSelection());
				System.out.println("Total charge: "+ goodsTransport.calculateTotalCharge());
			}
		} catch (InvalidIdException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
