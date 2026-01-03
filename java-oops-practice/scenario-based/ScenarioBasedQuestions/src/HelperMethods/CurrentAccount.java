package HelperMethods;

public class CurrentAccount extends Account{
	int overDraftLimit;

	public CurrentAccount(int balance, int accountNumber, int overDraftLimit) {
		super(balance, accountNumber);
		this.overDraftLimit = overDraftLimit;
	}
	
	public void displayDetails() {
		System.out.println("Balance: "+balance);
		System.out.println("Account No: "+ accountNumber);
		System.out.println("Over Draft Limit: "+overDraftLimit);
		System.out.println("------------------------------------");
	}
}
