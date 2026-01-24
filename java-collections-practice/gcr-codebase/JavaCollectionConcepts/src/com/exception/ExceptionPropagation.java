package com.exception;


public class ExceptionPropagation {

    static void method1() {
        int result = 10 / 0;   // ArithmeticException
    }

    static void method2() {
        method1();            // Exception propagates up
    }

    public static void main(String[] args) {

        try {
            method2();        // Exception reaches main
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
