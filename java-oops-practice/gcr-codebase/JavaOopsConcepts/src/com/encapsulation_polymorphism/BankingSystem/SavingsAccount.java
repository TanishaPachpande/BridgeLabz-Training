package com.encapsulation_polymorphism.BankingSystem;

class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    public void applyForLoan() {
        System.out.println("Loan applied under Savings Account.");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
