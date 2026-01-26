package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)  
@interface Todo {
    String task();              
    String assignedTo();        
    String priority() default "MEDIUM";  
}

class FeatureManager {

    @Todo(task = "Implement login feature", assignedTo = "Tanisha")
    public void login() {
        System.out.println("Login feature running");
    }

    @Todo(task = "Add payment gateway", assignedTo = "Raj", priority = "HIGH")
    public void payment() {
        System.out.println("Payment feature running");
    }

    public void report() {
        System.out.println("Report generated");
    }
}

public class TodoAnnotation {

    public static void main(String[] args) throws Exception {

        Class<FeatureManager> clazz = FeatureManager.class;

        for (Method method : clazz.getDeclaredMethods()) {
            
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName() +
                        ", Task: " + todo.task() +
                        ", Assigned To: " + todo.assignedTo() +
                        ", Priority: " + todo.priority());
            }
        }
    }
}

