package MyBank;

public interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

