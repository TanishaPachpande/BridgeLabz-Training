package com.collections.listinterface;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        int k = 2;
        int n = list.size();

        k = k % n;   // handle rotations > size

        List<Integer> rotated = new ArrayList<>();

        // Add elements from k to end
        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }

        // Add first k elements
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println(rotated);
    }
}

