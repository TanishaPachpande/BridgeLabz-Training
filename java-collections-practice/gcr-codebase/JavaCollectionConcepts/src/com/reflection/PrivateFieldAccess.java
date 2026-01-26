package com.reflection;

import java.lang.reflect.Field;

class Person {
    private int age = 20;
}

public class PrivateFieldAccess {

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        Class<?> clazz = person.getClass();

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);

        ageField.set(person, 30);

        int ageValue = (int) ageField.get(person);
        System.out.println("Updated Age: " + ageValue);
    }
}
