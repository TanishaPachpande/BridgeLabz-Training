package HelperMethods;

public class SavingsAccount extends Account {
	int interestRate;

	public SavingsAccount(int balance, int accountNumber, int interestRate) {
		super(balance, accountNumber);
		this.interestRate = interestRate;
	}
	
	public void displayDetails() {
		System.out.println("Balance: "+balance);
		System.out.println("Account No: "+ accountNumber);
		System.out.println("Interest Rate: "+interestRate);
		System.out.println("------------------------------------");
	}
}
