package BankAccount;

class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

