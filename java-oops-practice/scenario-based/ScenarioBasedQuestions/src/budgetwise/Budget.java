package budgetwise;

import java.util.ArrayList;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected ArrayList<Transaction> transactions;
    protected String[] categoryLimits;

    public Budget(double income, double limit, String[] categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Encapsulation: no direct editing
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double calculateTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage
    public double calculateNetSavings() {
        return income - calculateTotalExpenses();
    }

    @Override
    public abstract void generateReport();

    @Override
    public abstract void detectOverspend();
}

