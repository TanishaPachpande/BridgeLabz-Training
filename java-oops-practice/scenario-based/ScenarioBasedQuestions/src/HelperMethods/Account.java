package HelperMethods;

public class Account {
	int balance;
	int accountNumber;
	
	public Account(int balance, int accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void displayDetails() {
		System.out.println("Balance: "+balance);
		System.out.println("Account No: "+ accountNumber);
		System.out.println("------------------------------------");
	}
}
