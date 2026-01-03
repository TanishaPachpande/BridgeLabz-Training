package EwalletApp;

class BusinessWallet extends Wallet {
    private static final double TAX = 0.02; // 2% tax

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
        this.limit = 200000;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double taxAmount = amount * TAX;
        double totalAmount = amount + taxAmount;

        if (debit(totalAmount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Business Wallet transfer successful (Tax Applied)");
        } else {
            System.out.println("Transfer failed (limit/balance issue)");
        }
    }
}

