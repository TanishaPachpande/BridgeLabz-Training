package com.runtimeanalysis.recursiveiterative;

public class FibonacciRecursive {
	public static void main(String[] args) {
		int n=30;
		long startTime = System.nanoTime();
		findTime(n);
		long endTime = System.nanoTime();
		
		long executionTime = endTime-startTime;
		System.out.println("Time taken: "+ executionTime/10_00_000.0+ "ms");
	}
	
	public static int findTime(int n) {
		if(n<=1) {
			return n;
		}
		return findTime(n-1)+findTime(n-2);
	}
}
