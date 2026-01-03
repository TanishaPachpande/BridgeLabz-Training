package HelperMethods;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new CurrentAccount(12000, 1, 5);
		Account acc2 = new SavingsAccount(12000, 1, 2);
		
		acc1.displayDetails();
		acc2.displayDetails();
		
		if(HelperMethod.checkLoanEligibily(acc1.balance)) {
			System.out.println("Eligible for Loan");
		}else {
			System.out.println("Not Eligible for Loan");
		}
	}
}
