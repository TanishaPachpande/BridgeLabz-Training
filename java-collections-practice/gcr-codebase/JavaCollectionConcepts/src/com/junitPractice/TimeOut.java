package com.junit;

public class TimeOut {
	public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // 3 seconds
        return "Task Completed";
    }
}
