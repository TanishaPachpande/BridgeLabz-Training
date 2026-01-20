package com.fitnesstracker;

public class FitnessTracker {

    public static void bubbleSort(User[] users) {
        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Sort by steps (descending)
                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if no swaps
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        User[] users = {
            new User("Amit", 6500),
            new User("Neha", 8200),
            new User("Rahul", 5000),
            new User("Sneha", 9100),
            new User("Vikas", 7300)
        };

        bubbleSort(users);

        System.out.println("Daily Step Leaderboard:");
        int rank = 1;
        for (User u : users) {
            System.out.println(rank++ + ". " + u.name + " - " + u.steps + " steps");
        }
    }
}

