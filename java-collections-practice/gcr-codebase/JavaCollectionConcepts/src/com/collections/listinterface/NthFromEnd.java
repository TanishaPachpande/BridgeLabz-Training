package com.collections.listinterface;

import java.util.LinkedList;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        String result = findNthFromEnd(list, N);
        System.out.println(result);
    }

    static String findNthFromEnd(LinkedList<String> list, int N) {

        if (N <= 0 || N > list.size()) {
            return "Invalid N";
        }

        int first = 0;
        int second = 0;

        // Move first pointer N steps ahead
        for (int i = 0; i < N; i++) {
            first++;
        }

        // Move both pointers until first reaches end
        while (first < list.size()) {
            first++;
            second++;
        }

        return list.get(second);
    }
}

