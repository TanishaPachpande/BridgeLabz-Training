package payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate, 30);
    }

    @Override
    public void sendReminder() {
        if (!getPaymentStatus()) {
            System.out.println("💧 Water Bill Reminder! Due on: " + dueDate);
            System.out.println("Payable with late fee: " + calculateLateFee());
        }
    }
}

