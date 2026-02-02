package com.functionalinterfaces;

public class BackgroundJobExecution {
	public static void main(String[] args) {
		
		Runnable r = ()-> {
			System.out.println("Job Execution started.");
			System.out.println("Processing...");
			System.out.println("Job Execution finished.");
		};
		
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Main Process is starting...");
	}
}
