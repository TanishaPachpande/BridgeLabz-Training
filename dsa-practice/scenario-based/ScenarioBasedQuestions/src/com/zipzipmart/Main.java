package com.zipzipmart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sales records: ");
        int n = sc.nextInt();

        SalesRecord[] records = new SalesRecord[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Record " + (i + 1));
            sc.nextLine();

            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Branch Name: ");
            String branch = sc.nextLine();

            records[i] = new SalesRecord(date, amount, branch);
        }

        System.out.println("\nBefore Sorting:");
        for (SalesRecord r : records)
            r.display();

        ZipZipMartSorter.mergeSort(records, 0, records.length - 1);

        System.out.println("\nAfter Sorting (Date → Amount):");
        for (SalesRecord r : records)
            r.display();

        sc.close();
    }
}
