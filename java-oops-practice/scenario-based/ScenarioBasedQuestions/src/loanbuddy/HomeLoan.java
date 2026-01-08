package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int term, Applicant applicant) {
        super("Home Loan", term, 8.5, applicant);
    }

    // Polymorphism
    @Override
    public double calculateEMI() {
        return super.calculateEMI(); // lower interest
    }
}

