package loanbuddy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Applicant Name:");
        String name = sc.nextLine();

        System.out.println("Enter Credit Score:");
        int creditScore = sc.nextInt();

        System.out.println("Enter Monthly Income:");
        double income = sc.nextDouble();

        System.out.println("Enter Loan Amount:");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        System.out.println("\nChoose Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        int choice = sc.nextInt();

        System.out.println("Enter Loan Term (months):");
        int term = sc.nextInt();

        LoanApplication loan;

        if (choice == 1) {
            loan = new HomeLoan(term, applicant);
        } else {
            loan = new AutoLoan(term, applicant);
        }

        loan.approveLoan();
        loan.showDetails();

        sc.close();
    }
}

