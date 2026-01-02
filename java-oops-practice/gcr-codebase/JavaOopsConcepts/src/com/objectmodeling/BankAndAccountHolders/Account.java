package com.objectmodeling.BankAndAccountHolders;

class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
