package com.encapsulation_polymorphism.BankingSystem;

class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.01;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    public void applyForLoan() {
        System.out.println("Loan applied under Current Account.");
    }

    public double calculateLoanEligibility() {
        return balance * 3;
    }
}
