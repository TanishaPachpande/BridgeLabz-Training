package com.collections.mapinterface;

import java.util.*;

public class BankingSystem {

    // HashMap → AccountNumber -> Balance
    private static Map<Integer, Integer> accountMap = new HashMap<>();

    // Queue → Withdrawal requests
    private static Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // ---------------- Withdrawal Request Class ----------------
    static class WithdrawalRequest {
        int accountNumber;
        int amount;

        WithdrawalRequest(int accountNumber, int amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Display Accounts Sorted by Balance");
            System.out.println("3. Add Withdrawal Request");
            System.out.println("4. Process Withdrawal Requests");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    int balance = sc.nextInt();

                    accountMap.put(accNo, balance);
                    System.out.println("Account added!");
                    break;

                case 2:
                    displaySortedByBalance();
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int acc = sc.nextInt();

                    System.out.print("Enter Withdrawal Amount: ");
                    int amt = sc.nextInt();

                    withdrawalQueue.add(new WithdrawalRequest(acc, amt));
                    System.out.println("Withdrawal request added!");
                    break;

                case 4:
                    processWithdrawals();
                    break;

                case 5:
                    System.out.println("END");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- Display accounts sorted by balance ----------------
    private static void displaySortedByBalance() {

        // TreeMap → Balance -> Accounts
        TreeMap<Integer, List<Integer>> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accountMap.entrySet()) {
            sortedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Integer, List<Integer>> entry : sortedMap.entrySet()) {
            System.out.println("Balance " + entry.getKey() +
                               " → Accounts " + entry.getValue());
        }
    }

    // ---------------- Process withdrawals using Queue ----------------
    private static void processWithdrawals() {

        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();

            if (!accountMap.containsKey(request.accountNumber)) {
                System.out.println("Account not found: " + request.accountNumber);
                continue;
            }

            int currentBalance = accountMap.get(request.accountNumber);

            if (currentBalance >= request.amount) {
                accountMap.put(
                    request.accountNumber,
                    currentBalance - request.amount
                );
                System.out.println("Withdrawal successful for Account "
                        + request.accountNumber);
            } else {
                System.out.println("Insufficient balance for Account "
                        + request.accountNumber);
            }
        }
    }
}
