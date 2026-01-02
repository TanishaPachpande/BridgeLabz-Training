package com.objectmodeling.BankAndAccountHolders;

import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(int accountNumber) {
        Account account = new Account(accountNumber, this);
        accounts.add(account);
        System.out.println("Account opened in " + bankName + " with Account No: " + accountNumber);
        return account;
    }

    public String getBankName() {
        return bankName;
    }
}

