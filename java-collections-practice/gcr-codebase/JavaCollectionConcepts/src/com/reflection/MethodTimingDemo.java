package com.reflection;

import java.lang.reflect.Method;

class Task {

    public void execute() {
        for (int i = 0; i < 1_000_000; i++) {
            // Simulating work
        }
    }
}

class MethodTimer {

    public static void measureExecutionTime(
            Object obj, String methodName) throws Exception {

        Method method =
                obj.getClass().getDeclaredMethod(methodName);

        long startTime = System.nanoTime();
        method.invoke(obj);
        long endTime = System.nanoTime();

        System.out.println("Execution Time (ns): "
                + (endTime - startTime));
    }
}

public class MethodTimingDemo {

    public static void main(String[] args) throws Exception {

        Task task = new Task();

        MethodTimer.measureExecutionTime(task, "execute");
    }
}

