package com.banktransaction;

import java.util.HashMap;
import java.util.Map;

class Bank {

    // Stores accountNumber -> balance
    private Map<Integer, Integer> accounts = new HashMap<>();

    // Initialize accounts
    public Bank() {
        accounts.put(101, 1000);
        accounts.put(102, 1500);
        accounts.put(103, 2000);
    }

    // synchronized ensures only one thread can deposit at a time
    public synchronized void deposit(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);
        balance += amount;
        accounts.put(accountNumber, balance);

        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount +
                " into account " + accountNumber +
                ". New Balance: " + balance);
    }

    // synchronized ensures atomic withdrawal operation
    public synchronized void withdraw(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);

        if (balance >= amount) {
            balance -= amount;
            accounts.put(accountNumber, balance);

            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    " from account " + accountNumber +
                    ". New Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw " + amount +
                    " from account " + accountNumber +
                    " but insufficient balance!");
        }
    }

    // synchronized to ensure consistent read
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
