package com.downloadmanager;
import java.util.Random;

class FileDownloaderThread extends Thread {

	private String fileName;
	private Random random = new Random();

	public FileDownloaderThread(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		int progress = 0;

		while (progress < 100) {
			progress += random.nextInt(20) + 1; // 1–20%
			if (progress > 100) {
				progress = 100;
			}

			System.out.println(
					"[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + progress + "%");

			try {
				Thread.sleep(random.nextInt(500) + 200); // random delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
