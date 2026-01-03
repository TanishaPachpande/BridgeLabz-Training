package BankAccount;

class Customer {
    private int customerId;
    private String name;
    private Account account;

    public Customer(int customerId, String name, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }

    public void showDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }

    public Account getAccount() {
        return account;
    }
}

