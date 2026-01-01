package com.inheritance.hierarchical.BankAccountTypes;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, int balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
	
	void displayDetails() {
        displayAccountType();
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("--------------------------");
    }
}
