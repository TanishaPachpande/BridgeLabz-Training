package com.runtimeanalysis.stringconcatenation;

public class StringTime {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        String str = "";
        for (int i = 1; i <= 1_000; i++) {
            str = str + "a";
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Time taken (String): " + timeMs + " ms");
    }
}

