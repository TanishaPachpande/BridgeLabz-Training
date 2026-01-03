package EwalletApp;

import java.util.ArrayList;

abstract class Wallet implements Transferrable {
    private double balance;   // private – cannot be manipulated directly
    protected double limit;
    protected ArrayList<Transaction> history = new ArrayList<>();

    // Constructor without referral bonus
    public Wallet() {
        this.balance = 0.0;
    }

    // Constructor with referral bonus
    public Wallet(double referralBonus) {
        this.balance = referralBonus;
        history.add(new Transaction("Referral Bonus", referralBonus));
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
        history.add(new Transaction("Credit", amount));
    }

    protected boolean debit(double amount) {
        if (amount <= balance && amount <= limit) {
            balance -= amount;
            history.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t.getDetails());
        }
    }
}
