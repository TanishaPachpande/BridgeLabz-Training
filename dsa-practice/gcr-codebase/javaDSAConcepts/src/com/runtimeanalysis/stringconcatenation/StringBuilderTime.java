package com.runtimeanalysis.stringconcatenation;

public class StringBuilderTime {
    public static void main(String[] args) {
    	int n=10_00_000;
    	long startTime = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long endTime = System.nanoTime();
        double stringBuilderTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("StringBuilder Time: " + stringBuilderTime + " ms");
	}

}
