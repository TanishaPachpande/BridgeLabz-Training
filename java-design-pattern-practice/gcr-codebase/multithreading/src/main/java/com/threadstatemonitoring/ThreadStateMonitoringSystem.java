package com.threadstatemonitoring;
public class ThreadStateMonitoringSystem {

    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        Thread[] tasks = {task1, task2};

        StateMonitor monitor = new StateMonitor(tasks);

        // Threads are NEW here
        monitor.start();
        task1.start();
        task2.start();
    }
}