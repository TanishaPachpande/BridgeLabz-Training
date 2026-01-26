package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {

    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

class DIContainer {

    public static void injectDependencies(Object obj) throws Exception {

        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {

                Object dependency =
                        field.getType().getDeclaredConstructor().newInstance();

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
    }
}

public class DIDemo {

    public static void main(String[] args) throws Exception {

        Car car = new Car();

        DIContainer.injectDependencies(car);

        car.drive();
    }
}

