package com.objectmodeling.UniversityWithFaculties;

public class Main {
    public static void main(String[] args) {

        University uni = new University("Global Tech University");

        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        Department cs = uni.addDepartment("Computer Science");
        Department mech = uni.addDepartment("Mechanical");

        cs.addFaculty(f1);
        mech.addFaculty(f2);

        uni.displayUniversity();

        // Deleting university
        uni.closeUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists after university deletion:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}
