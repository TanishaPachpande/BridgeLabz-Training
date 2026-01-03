package BankAccount;

public class Main {
    public static void main(String[] args) {

        Account savings = new SavingsAccount(101, 5000, 5);
        Customer customer1 = new Customer(1, "Tanisha", savings);

        customer1.showDetails();
        savings.deposit(2000);
        savings.withdraw(1000);

        ((SavingsAccount) savings).calculateInterest();

        System.out.println("Final Balance: " + savings.getBalance());
    }
}

