package com.inheritance.hierarchical.BankAccountTypes;

public class FixedDepositAccount extends BankAccount{

	private int duration;

	public FixedDepositAccount(String accountNumber, int balance, int duration) {
		super(accountNumber, balance);
		this.duration = duration;
	}
	
	void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    void displayDetails() {
        displayAccountType();
        displayAccountDetails();
        System.out.println("Tenure: " + duration + " years");
        System.out.println("--------------------------");
    }

}
