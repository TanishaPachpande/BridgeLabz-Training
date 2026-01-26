package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)  // Must be accessible at runtime
@interface LogExecutionTime {
}

class TaskProcessor {

    @LogExecutionTime
    public void quickTask() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
    }

    @LogExecutionTime
    public void heavyTask() {
        int sum = 0;
        for (int i = 0; i < 5_000_000; i++) {
            sum += i;
        }
    }

    public void normalTask() {
        System.out.println("Normal task, not timed");
    }
}

public class LogExecutionTimeDemo {

    public static void main(String[] args) throws Exception {

        TaskProcessor processor = new TaskProcessor();
        Class<?> clazz = processor.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();
                method.invoke(processor);  
                long endTime = System.nanoTime();

                long duration = endTime - startTime;
                System.out.println("Method: " + method.getName() +
                        ", Execution time: " + duration + " ns");
            }
        }
    }
}



