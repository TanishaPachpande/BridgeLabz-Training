package com.inheritance.hierarchical.BankAccountTypes;

public class Main {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA201", 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FD301", 200000, 5);

        savings.displayDetails();
        checking.displayDetails();
        fd.displayDetails();

	}

}
