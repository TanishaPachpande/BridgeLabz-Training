package EwalletApp;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Tanisha", new PersonalWallet(200));
        User u2 = new User("Rahul", new BusinessWallet(500));

        u1.showBalance();
        u2.showBalance();

        u1.getWallet().transferTo(u2, 1000);
        u2.getWallet().transferTo(u1, 2000);

        u1.showBalance();
        u2.showBalance();

        System.out.println("\nTanisha Transaction History:");
        u1.getWallet().showHistory();
    }
}

