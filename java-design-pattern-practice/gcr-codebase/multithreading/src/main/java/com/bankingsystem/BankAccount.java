package com.bankingsystem;

class BankAccount {

	private int balance = 10000;

	public int getBalance() {
		return balance;
	}

	// NOT synchronized (intentional for learning)
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			// simulate processing time
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			return true;
		}
		return false;
	}
}
