package com.linkedlist.circularlist.RoundRobinSchedulingAlgorithm;

class RoundRobinScheduler {
    private ProcessNode tail;
    private int timeQuantum;
    private int totalTime = 0;
    private int processCount = 0;
    private int totalWaitingTime = 0;
    private int totalTurnaroundTime = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        tail = null;
    }

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(pid, burstTime, priority);

        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
        } else {
            newProcess.next = tail.next;
            tail.next = newProcess;
            tail = newProcess;
        }
        processCount++;
    }

    // Simulate Round Robin Scheduling
    public void simulate() {
        if (tail == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        ProcessNode current = tail.next;

        while (tail != null) {
            displayProcesses();

            if (current.remainingTime > timeQuantum) {
                totalTime += timeQuantum;
                current.remainingTime -= timeQuantum;
            } else {
                totalTime += current.remainingTime;
                current.remainingTime = 0;

                current.turnaroundTime = totalTime;
                current.waitingTime =
                        current.turnaroundTime - current.burstTime;

                totalWaitingTime += current.waitingTime;
                totalTurnaroundTime += current.turnaroundTime;

                removeProcess(current.pid);
            }

            current = current.next;
        }

        displayAverageTimes();
    }

    // Remove process by PID
    private void removeProcess(int pid) {
        if (tail == null) return;

        ProcessNode curr = tail.next;
        ProcessNode prev = tail;

        do {
            if (curr.pid == pid) {
                if (curr == tail && curr.next == tail) {
                    tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == tail)
                        tail = prev;
                }
                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);
    }

    // Display process list
    public void displayProcesses() {
        if (tail == null) return;

        ProcessNode temp = tail.next;
        System.out.print("Process Queue: ");

        do {
            System.out.print(
                "[P" + temp.pid +
                " | Remaining: " + temp.remainingTime + "] -> "
            );
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

    // Display averages
    private void displayAverageTimes() {
        System.out.println("\nScheduling Completed.");
        System.out.println("Average Waiting Time = "
                + (double) totalWaitingTime / (totalWaitingTime == 0 ? 1 : (totalWaitingTime / totalWaitingTime + processCount)));
        System.out.println("Average Turnaround Time = "
                + (double) totalTurnaroundTime / (totalTurnaroundTime == 0 ? 1 : (totalTurnaroundTime / totalTurnaroundTime + processCount)));
    }
}

