package com.threadstatemonitoring;

class TaskRunner extends Thread {

	public TaskRunner(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			// Simulate computation
			for (int i = 0; i < 1_000_000; i++) {
				Math.sqrt(i);
			}

			// Timed waiting
			Thread.sleep(2000);

			// More computation
			for (int i = 0; i < 1_000_000; i++) {
				Math.pow(i, 2);
			}

		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted");
		}
	}
}