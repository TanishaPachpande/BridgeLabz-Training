package com.stackqueue;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> stackEnqueue; // Stack for enqueue
    private Stack<Integer> stackDequeue; // Stack for dequeue

    // Constructor
    public QueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    // Enqueue operation (O(1))
    public void enqueue(int value) {
        stackEnqueue.push(value);
        System.out.println(value + " enqueued");
    }

    // Dequeue operation (Amortized O(1))
    public Integer dequeue() {
        if (stackDequeue.isEmpty()) {
            // Transfer all elements from enqueue stack to dequeue stack
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty");
            return null;
        }

        int value = stackDequeue.pop();
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Peek front element
    public Integer peek() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return stackDequeue.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.dequeue(); // underflow test

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());

        queue.dequeue();
        queue.enqueue(40);

        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        queue.dequeue(); // underflow test
    }
}

