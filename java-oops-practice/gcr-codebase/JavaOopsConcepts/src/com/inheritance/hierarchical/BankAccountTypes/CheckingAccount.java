package com.inheritance.hierarchical.BankAccountTypes;

public class CheckingAccount extends BankAccount {

	private int withdrawalLimit;

	public CheckingAccount(String accountNumber, int balance, int withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    void displayDetails() {
        displayAccountType();
        displayAccountDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
        System.out.println("--------------------------");
    }

}
