package com.collections.mapinterface;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> voteMap = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Vote");
            System.out.println("2. Display Results (Sorted - TreeMap)");
            System.out.println("3. Display Vote Order (LinkedHashMap)");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Candidate Name: ");
                    String name = sc.next();

                    System.out.print("Enter Votes Count: ");
                    int votes = sc.nextInt();

                    voteMap.put(name, voteMap.getOrDefault(name, 0) + votes);

                    System.out.println("Vote Added!");
                    break;

                case 2:
                    Map<String, Integer> treeMap = new TreeMap<>(voteMap);
                    System.out.println("Sorted Results: " + treeMap);
                    break;

                case 3:
                    Map<String, Integer> linkedHashMap = new LinkedHashMap<>(voteMap);
                    System.out.println("Vote Order: " + linkedHashMap);
                    break;

                case 4:
                    System.out.println("END");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
