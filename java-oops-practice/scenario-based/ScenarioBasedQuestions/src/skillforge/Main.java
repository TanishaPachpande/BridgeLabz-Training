package skillforge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Instructor Name: ");
        String instName = sc.nextLine();

        System.out.print("Enter Instructor Email: ");
        String instEmail = sc.nextLine();

        Instructor instructor = new Instructor(instName, instEmail);

        System.out.print("\nEnter Student Name: ");
        String stuName = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String stuEmail = sc.nextLine();

        Student student = new Student(stuName, stuEmail, 3);

        System.out.println("\nChoose Course Level: 1. Beginner  2. Advanced");
        int choice = sc.nextInt();

        Course course=null;

        if (choice == 1) {
            course = new BeginnerCourse("Java Basics", instructor);
        } else {
            course = new AdvancedCourse("Java Mastery", instructor);
        }

        course.displayCourse();

        // simulate progress
        student.completeModule();
        student.completeModule();
        student.completeModule();

        System.out.println("\nProgress: " + student.getProgressPercentage() + "%");
        student.generateCertificate();

    }
}
