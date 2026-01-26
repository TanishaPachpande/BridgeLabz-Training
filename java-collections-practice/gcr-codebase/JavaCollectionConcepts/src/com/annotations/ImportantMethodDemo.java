package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)  
@interface ImportantMethod {
    String level() default "HIGH";   
}

class Project {

    @ImportantMethod
    public void deploy() {
        System.out.println("Deploying project...");
    }

    @ImportantMethod(level = "CRITICAL")
    public void backup() {
        System.out.println("Backing up data...");
    }

    public void test() {
        System.out.println("Running tests...");
    }
}

public class ImportantMethodDemo {

    public static void main(String[] args) {

        Class<Project> clazz = Project.class;

        // Loop through all methods and check for annotation
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + imp.level());
            }
        }
    }
}

