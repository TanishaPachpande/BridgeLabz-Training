package com.hospitalqueue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of patient " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Criticality (1-10): ");
            int crit = sc.nextInt();

            patients[i] = new Patient(id, name, crit);
        }

        System.out.println("\nBefore Sorting:");
        for (Patient p : patients)
            p.display();

        HospitalQueue.sortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        for (Patient p : patients)
            p.display();

        sc.close();
    }
}

