package com.dealtracker;

public class Main {
    public static void main(String[] args) {

        DealTracker<String> tracker =
                new DealTracker<>();

        tracker.processFile("deals.txt", "Discount Offer");
    }
}

