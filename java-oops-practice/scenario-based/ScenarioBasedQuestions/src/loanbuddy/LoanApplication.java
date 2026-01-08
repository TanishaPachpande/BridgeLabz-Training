package loanbuddy;

public class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term;               // in months
    protected double interestRate;    // yearly
    protected Applicant applicant;

    private boolean approved;         // internal only

    public LoanApplication(String loanType, int term, double interestRate, Applicant applicant) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
    }

    // Approval logic (encapsulated)
    public void approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 20000) {
            approved = true;
            System.out.println("Loan Approved ✅");
        } else {
            approved = false;
            System.out.println("Loan Rejected ❌");
        }
    }

    // EMI formula
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }

    public void showDetails() {
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Type: " + loanType);
        System.out.println("EMI: ₹" + (int) calculateEMI());
    }
}

