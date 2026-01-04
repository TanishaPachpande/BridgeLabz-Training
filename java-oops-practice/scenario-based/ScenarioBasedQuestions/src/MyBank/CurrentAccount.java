package MyBank;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0; // 1%

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
