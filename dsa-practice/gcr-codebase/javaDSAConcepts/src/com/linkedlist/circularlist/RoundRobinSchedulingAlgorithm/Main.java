package com.linkedlist.circularlist.RoundRobinSchedulingAlgorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler(4);

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        rr.simulate();
    }
}

