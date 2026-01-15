package budgetwise;

public class AnnualBudget extends Budget {

    private int year;

    public AnnualBudget(double income, double limit, String[] categoryLimits, int year) {
        super(income, limit, categoryLimits);
        this.year = year;
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Annual Budget Report (" + year + ") ---");
        System.out.println("Annual Income: " + income);
        System.out.println("Total Expenses: " + calculateTotalExpenses());
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (calculateTotalExpenses() > limit) {
            System.out.println("⚠ Overspending detected this year!");
        } else {
            System.out.println("✔ Expenses within annual limit.");
        }
    }
}

