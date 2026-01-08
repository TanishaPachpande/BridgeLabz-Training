package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(int term, Applicant applicant) {
        super("Auto Loan", term, 10.5, applicant);
    }

    // Polymorphism
    @Override
    public double calculateEMI() {
        return super.calculateEMI(); // higher interest
    }
}

