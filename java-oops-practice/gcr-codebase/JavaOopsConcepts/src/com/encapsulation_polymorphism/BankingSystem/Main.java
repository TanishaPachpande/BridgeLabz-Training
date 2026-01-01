package com.encapsulation_polymorphism.BankingSystem;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", "Tanisha", 50000);
        BankAccount acc2 = new CurrentAccount("CA202", "Amit", 100000);

        BankAccount[] accounts = { acc1, acc2 };

        for (BankAccount acc : accounts) {
            System.out.println("\nAccount Holder: " + acc.getHolderName());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println("Interest: ₹" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: ₹" + loan.calculateLoanEligibility());
            }
        }
    }
}

