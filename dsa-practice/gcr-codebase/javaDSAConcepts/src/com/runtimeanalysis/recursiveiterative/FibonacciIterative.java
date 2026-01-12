package com.runtimeanalysis.recursiveiterative;

public class FibonacciIterative {
	public static void main(String[] args) {
		int n=30;
		long startTime = System.nanoTime();
		findTime(n);
		long endTime = System.nanoTime();
		
		long executionTime = endTime-startTime;
		System.out.println("Time taken: "+ executionTime/10_00_000.0+ "ms");
	}
	
	public static int findTime(int n) {
		int a=0, b=1, sum=0;
		for(int i=0; i<(n-2); i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		return b;
	}
}
