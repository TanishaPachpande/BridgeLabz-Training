package com.zipzipmart;

public class SalesRecord {

    String date;      // YYYY-MM-DD
    double amount;
    String branch;

    public SalesRecord(String date, double amount, String branch) {
        this.date = date;
        this.amount = amount;
        this.branch = branch;
    }

    public void display() {
        System.out.println(date + " | ₹" + amount + " | " + branch);
    }
}

