package payxpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate, 100);
    }

    @Override
    public void sendReminder() {
        if (!getPaymentStatus()) {
            System.out.println("🌐 Internet Bill Reminder! Due on: " + dueDate);
            System.out.println("Payable with late fee: " + calculateLateFee());
        }
    }
}
