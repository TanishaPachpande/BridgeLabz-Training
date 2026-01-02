package com.objectmodeling.BankAndAccountHolders;

import java.util.ArrayList;

class Customer {
    private String customerName;
    private ArrayList<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nCustomer: " + customerName);
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getBankName() +
                               ", Account No: " + account.getAccountNumber() +
                               ", Balance: ₹" + account.getBalance());
        }
    }
}
