package com.inheritance.hierarchical.BankAccountTypes;

public class BankAccount {
	protected String accountNumber;
	protected int balance;
	
	public BankAccount(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
