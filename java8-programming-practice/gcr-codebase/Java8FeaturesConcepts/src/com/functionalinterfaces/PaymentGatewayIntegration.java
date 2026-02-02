package com.functionalinterfaces;

@FunctionalInterface
interface PaymentProcessor{
	
	void processPayment(double amt);
	
	default void refund(double amt) {
		System.out.println("Amount Refunded!");
	}
}

public class PaymentGatewayIntegration {
	public static void main(String[] args) {

        PaymentProcessor paytm = amount ->
                System.out.println("Paytm payment of " + amount + " processed");

        paytm.processPayment(500);
        paytm.refund(200);

    }
}
