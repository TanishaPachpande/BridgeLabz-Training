package HospitalPatientSystem;

class Bill implements Payable {
    private double consultationFee;
    private double medicineCharges;
    private double discount;
    private static final double TAX_RATE = 0.05; // 5% tax

    public Bill(double consultationFee, double medicineCharges, double discount) {
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double total = consultationFee + medicineCharges;
        total = total - discount;        // operator usage
        total = total + (total * TAX_RATE);
        return total;
    }
}
