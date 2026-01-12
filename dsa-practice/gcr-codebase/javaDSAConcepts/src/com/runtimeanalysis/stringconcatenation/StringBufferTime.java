package com.runtimeanalysis.stringconcatenation;

public class StringBufferTime {
	public static void main(String[] args) {
		int n=10_00_000;
    	long startTime = System.nanoTime();

        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            bf.append("a");
        }

        long endTime = System.nanoTime();
        double stringBufferTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("StringBuffer Time: " + stringBufferTime + " ms");
	}
}
