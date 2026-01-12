package com.runtimeanalysis.datastructuresearching;


import java.util.*;

public class SearchTimeComparison {

    public static void main(String[] args) {

        int N = 1_000_000;   // change to 1000 / 100000 / 1000000
        int target = N - 1;  // worst-case element

        // ---------- Array ----------
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }

        long startTime = System.nanoTime();

        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        long endTime = System.nanoTime();
        double arrayTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("Array Search Time: " + arrayTime + " ms");

        // ---------- HashSet ----------
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(i);
        }

        startTime = System.nanoTime();
        hashSet.contains(target);
        endTime = System.nanoTime();

        double hashSetTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("HashSet Search Time: " + hashSetTime + " ms");

        // ---------- TreeSet ----------
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            treeSet.add(i);
        }

        startTime = System.nanoTime();
        treeSet.contains(target);
        endTime = System.nanoTime();

        double treeSetTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("TreeSet Search Time: " + treeSetTime + " ms");
    }
}

