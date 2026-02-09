package com.threadstatemonitoring;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {

        for (Thread t : threads) {
            stateHistory.put(t.getName(), new HashSet<>());
        }

        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                stateHistory.get(t.getName()).add(state);

                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted");
            }
        }

        // Summary
        System.out.println("\n===== SUMMARY =====");
        for (String name : stateHistory.keySet()) {
            System.out.println("Summary: " + name +
                    " went through " +
                    stateHistory.get(name).size() +
                    " states -> " +
                    stateHistory.get(name));
        }
    }
}