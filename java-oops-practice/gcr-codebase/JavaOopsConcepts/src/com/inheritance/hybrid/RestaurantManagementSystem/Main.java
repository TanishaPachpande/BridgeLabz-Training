package com.inheritance.hybrid.RestaurantManagementSystem;

public class Main {

	public static void main(String[] args) {
		    Chef chef = new Chef("Ravi", 101, "Italian");
	        Waiter waiter = new Waiter("Amit", 201, 5);

	        System.out.println("---- Chef Details ----");
	        chef.displayPersonInfo();
	        chef.performDuties();

	        System.out.println("\n---- Waiter Details ----");
	        waiter.displayPersonInfo();
	        waiter.performDuties();
	}

}
