package MyBank;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0; // 4%

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}

