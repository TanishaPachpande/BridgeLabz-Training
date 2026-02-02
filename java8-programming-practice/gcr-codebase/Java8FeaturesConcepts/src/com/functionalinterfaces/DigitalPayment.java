package com.functionalinterfaces;

@FunctionalInterface
interface Transfer{
	void pay();
}

public class DigitalPayment {
	public static void main(String[] args) {
		Transfer upi = ()-> System.out.println("Money transferred through UPI");
		Transfer credictCard = ()-> System.out.println("Money transferred through Credit Card");
		Transfer wallet = ()-> System.out.println("Money transferred through Wallet");
		
		execute(upi);
		execute(credictCard);
		execute(wallet);
	}
	
	static void execute(Transfer t) {
		t.pay();
	}
}
