package com.reflection;

class Student {
    public Student() {
        System.out.println("Student object created");
    }
}

public class DynamicObjectCreation {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Object Type: " + obj.getClass().getName());
    }
}

