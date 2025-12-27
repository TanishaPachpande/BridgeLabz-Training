package com.constructors.level1;

public class PostgraduateStudent extends Student {

    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);              // protected
        System.out.println("CGPA: " + getCGPA());         // private via getter
        System.out.println("Specialization: " + specialization);
    }

    // MAIN METHOD HERE
    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(
                101,
                "Tanisha",
                8.8,
                "Computer Science"
        );

        pg.displayDetails();

        // Updating CGPA
        pg.setCGPA(9.2);
        System.out.println("\nAfter Update:");
        pg.displayDetails();
    }
}
