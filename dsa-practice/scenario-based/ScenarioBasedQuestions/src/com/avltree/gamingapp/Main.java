package com.avltree.gamingapp;

public class Main {
    public static void main(String[] args) {

        LeaderboardAVL leaderboard = new LeaderboardAVL();

        // 🔹 Scenario 1: Insert / Update Players
        leaderboard.root = leaderboard.insert(leaderboard.root, "Alex", 1500);
        leaderboard.root = leaderboard.insert(leaderboard.root, "Bella", 1800);
        leaderboard.root = leaderboard.insert(leaderboard.root, "Chris", 1200);
        leaderboard.root = leaderboard.insert(leaderboard.root, "Diana", 2000);
        leaderboard.root = leaderboard.insert(leaderboard.root, "Evan", 1700);

        // 🔹 Scenario 2: Display Top Players
        System.out.println(" Top Players Leaderboard:");
        leaderboard.displayTop(leaderboard.root, new int[]{0});

        // 🔹 Scenario 3: Remove Player (Ban)
        System.out.println("\nRemoving player with score 1700");
        leaderboard.root = leaderboard.delete(leaderboard.root, 1700);

        System.out.println("\nUpdated Leaderboard:");
        leaderboard.displayTop(leaderboard.root, new int[]{0});
    }
}

