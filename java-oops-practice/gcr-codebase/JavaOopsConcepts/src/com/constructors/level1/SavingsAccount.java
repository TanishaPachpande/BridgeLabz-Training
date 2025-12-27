package com.constructors.level1;

public class SavingsAccount extends BankAccount{
	double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Demonstrating access to public & protected members
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);   // public
        System.out.println("Account Holder: " + accountHolder);   // protected
        System.out.println("Balance: ₹" + getBalance());          // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // MAIN METHOD
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                1234567890L,
                "Tanisha",
                10000.0,
                4.5
        );

        sa.displayAccountDetails();

        // Deposit and withdraw
        sa.deposit(5000);
        sa.withdraw(2000);

        System.out.println("\nAfter Transactions:");
        sa.displayAccountDetails();
    }
}
