package com.constructors.level1;

public class CarRental {

	// Attributes
	String customerName;
	String carModel;
	int rentalDays;
	
	// Parameterized Constructor
	CarRental(String customerName, String carModel, int rentalDays){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	
	// displaying total rental cost
	void displayTotalCost() {
		int pricePerDay=100;
		System.out.println("The Customer Name is "+ customerName);
		System.out.println("The Car Model is "+ carModel);
		System.out.println("No. of rental days are "+ rentalDays);
		System.out.println("The Total Cost is "+ pricePerDay*rentalDays);
	}
	
	public static void main(String[] args){
		CarRental c = new CarRental("Ashish", "xyz", 5);
		c.displayTotalCost();
	}

}
