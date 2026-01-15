package payxpress;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;

    private boolean isPaid;          // Encapsulation
    private double penalty;          // Internal payment detail

    // Constructor for recurring bills
    public Bill(String type, double amount, String dueDate, double penalty) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.penalty = penalty;
        this.isPaid = false;
    }

    // Operator usage: late fee calculation
    protected double calculateLateFee() {
        return amount + penalty;
    }

    // Controlled payment
    @Override
    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully. Amount: " + amount);
        } else {
            System.out.println(type + " bill already paid.");
        }
    }

    protected boolean getPaymentStatus() {
        return isPaid;
    }

    @Override
    public abstract void sendReminder(); // Polymorphism
}

