package com.exception;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}


public class BankTransactionSystem {
	static double balance=1000;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
		System.out.print("Enter amount: ");
		double amount = sc.nextDouble();
		withdraw(amount);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	
	public static void withdraw(double amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
		
		if(amount<0) {
			throw new IllegalArgumentException("Invalid Amount!");
		}
		balance-=amount;
		System.out.println("Withdrawal successful, new balance: "+balance);
	}
}
