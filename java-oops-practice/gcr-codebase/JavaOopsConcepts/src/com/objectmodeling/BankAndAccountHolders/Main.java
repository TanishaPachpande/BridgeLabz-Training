package com.objectmodeling.BankAndAccountHolders;

public class Main {
    public static void main(String[] args) {

        Bank sbi = new Bank("State Bank of India");
        Bank hdfc = new Bank("HDFC Bank");

        Customer tanisha = new Customer("Tanisha");

        Account acc1 = sbi.openAccount(101);
        Account acc2 = hdfc.openAccount(202);

        tanisha.addAccount(acc1);
        tanisha.addAccount(acc2);

        acc1.deposit(5000);
        acc2.deposit(12000);

        tanisha.viewBalance();
    }
}

