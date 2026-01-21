package com.collections.setinterface;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        while (true) {
            System.out.println("\n---------------------------------");
            System.out.println("1. Add Policy");
            System.out.println("2. Display All Policies");
            System.out.println("3. Policies Expiring in 30 Days");
            System.out.println("4. Policies by Coverage Type");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Policy Number: ");
                    int number = sc.nextInt();

                    System.out.print("Enter Policy Holder Name: ");
                    String name = sc.next();

                    System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.next());

                    System.out.print("Enter Coverage Type: ");
                    String type = sc.next();

                    System.out.print("Enter Premium Amount: ");
                    int amount = sc.nextInt();

                    Policy policy = new Policy(number, name, date, type, amount);

                    boolean added = hashSet.add(policy);

                    if (!added) {
                        System.out.println("Duplicate policy number! Policy not added.");
                    } else {
                        linkedHashSet.add(policy);
                        treeSet.add(policy);
                        System.out.println("Policy added successfully!");
                    }
                    break;

                case 2:
                    System.out.println("\nHashSet (Fast Lookup):");
                    for (Policy p : hashSet)
                        System.out.println(p);

                    System.out.println("\nLinkedHashSet (Insertion Order):");
                    for (Policy p : linkedHashSet)
                        System.out.println(p);

                    System.out.println("\nTreeSet (Sorted by Expiry Date):");
                    for (Policy p : treeSet)
                        System.out.println(p);
                    break;

                case 3:
                    System.out.println("\nPolicies expiring within 30 days:");
                    LocalDate today = LocalDate.now();

                    for (Policy p : hashSet) {
                        if (!p.expiryDate.isBefore(today)
                                && p.expiryDate.isBefore(today.plusDays(30))) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter coverage type: ");
                    String searchType = sc.next();

                    System.out.println("\nMatching Policies:");
                    for (Policy p : hashSet) {
                        if (p.coverageType.equalsIgnoreCase(searchType)) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    System.out.println("END");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
