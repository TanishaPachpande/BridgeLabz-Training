package com.constructors.level1;

public class Circle {

    // Attribute
    double radius;

    // Default constructor (sets default radius)
    public Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius of the circle: " + radius);
    }
    
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.displayRadius();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.displayRadius();
    }
}
