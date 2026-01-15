package budgetwise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Budget Type:");
        System.out.println("1. Monthly Budget\n2. Annual Budget");
        int choice = sc.nextInt();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Expense Limit: ");
        double limit = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter Categories (comma separated): ");
        String[] categories = sc.nextLine().split(",");

        Budget budget;

        if (choice == 1) {
            System.out.print("Enter Month: ");
            String month = sc.nextLine();
            budget = new MonthlyBudget(income, limit, categories, month);
        } else {
            System.out.print("Enter Year: ");
            int year = sc.nextInt();
            budget = new AnnualBudget(income, limit, categories, year);
        }

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nTransaction " + (i + 1));
            System.out.print("Amount: ");
            double amount = sc.nextDouble();

            sc.nextLine();
            System.out.print("Type (Income/Expense): ");
            String type = sc.nextLine();

            System.out.print("Date: ");
            String date = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            budget.addTransaction(new Transaction(amount, type, date, category));
        }

        budget.generateReport();
        budget.detectOverspend();

        sc.close();
    }
}

