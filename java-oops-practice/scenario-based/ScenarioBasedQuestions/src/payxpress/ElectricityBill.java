package payxpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate, 50);
    }

    @Override
    public void sendReminder() {
        if (!getPaymentStatus()) {
            System.out.println("⚡ Electricity Bill Reminder! Due on: " + dueDate);
            System.out.println("Payable with late fee: " + calculateLateFee());
        }
    }
}

