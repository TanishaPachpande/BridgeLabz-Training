package HelperMethods;

public class HelperMethod {
	
	public static boolean checkLoanEligibily(int balance) {
		if(balance<10000) {
			return false;
		}
		return true;
	}
	
	public double calculateInterest(int balance) {
		if(balance>20000) {
			return balance*0.10;
		}
	    return 0;
	}
}
