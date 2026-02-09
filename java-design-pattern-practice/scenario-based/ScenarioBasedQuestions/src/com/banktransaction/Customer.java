package com.banktransaction;

class Customer extends Thread {

    private Bank bank;
    private int accountNumber;

    public Customer(String name, Bank bank, int accountNumber) {
        super(name);
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {
        bank.deposit(accountNumber, 500);

        try {
            Thread.sleep(100); // simulate real-world delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bank.withdraw(accountNumber, 300);
    }
}
