package EwalletApp;

class PersonalWallet extends Wallet {

    public PersonalWallet() {
        super();
        this.limit = 50000;
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
        this.limit = 50000;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Personal Wallet transfer successful");
        } else {
            System.out.println("Transfer failed (limit/balance issue)");
        }
    }
}

