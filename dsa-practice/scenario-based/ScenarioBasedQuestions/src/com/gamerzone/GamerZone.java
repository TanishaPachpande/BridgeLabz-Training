package com.gamerzone;

public class GamerZone {

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {
        int pivot = players[high].score;
        int i = low - 1;

        // Descending order (highest score first)
        for (int j = low; j < high; j++) {
            if (players[j].score > pivot) {
                i++;
                swap(players, i, j);
            }
        }
        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Amit", 1200),
            new Player("Neha", 980),
            new Player("Rahul", 1500),
            new Player("Sneha", 1100),
            new Player("Vikas", 1700)
        };

        quickSort(players, 0, players.length - 1);

        System.out.println("GamerZone Leaderboard:");
        int rank = 1;
        for (Player p : players) {
            System.out.println(rank++ + ". " + p.name + " - " + p.score);
        }
    }
}

