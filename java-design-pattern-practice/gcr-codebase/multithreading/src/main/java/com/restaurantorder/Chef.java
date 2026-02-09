package com.restaurantorder;

class Chef extends Thread {

	private String dish;
	private int totalTime; // in milliseconds

	public Chef(String chefName, String dish, int totalTime) {
		super(chefName); // set thread name
		this.dish = dish;
		this.totalTime = totalTime;
	}

	@Override
	public void run() {

		System.out.println(getName() + " started preparing " + dish);

		int[] progress = { 25, 50, 75, 100 };
		int stepTime = totalTime / progress.length;

		for (int p : progress) {
			try {
				Thread.sleep(stepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
		}

		System.out.println(getName() + " completed " + dish);
	}
}