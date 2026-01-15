package budgetwise;

public class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(double income, double limit, String[] categoryLimits, String month) {
        super(income, limit, categoryLimits);
        this.month = month;
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Monthly Budget Report (" + month + ") ---");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + calculateTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (calculateTotalExpenses() > limit) {
            System.out.println("⚠ Overspending detected this month!");
        } else {
            System.out.println("✔ Expenses within monthly limit.");
        }
    }
}

