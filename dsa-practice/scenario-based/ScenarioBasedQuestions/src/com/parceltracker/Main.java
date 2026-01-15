package com.parceltracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        while (true) {
            System.out.println("\n--- Parcel Tracker Menu ---");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Check Parcel Status");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    tracker.trackParcel();
                    break;

                case 2:
                    System.out.print("Add after stage: ");
                    String after = sc.nextLine();

                    System.out.print("New checkpoint name: ");
                    String checkpoint = sc.nextLine();

                    tracker.addCheckpoint(after, checkpoint);
                    break;

                case 3:
                    tracker.checkParcelStatus();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

