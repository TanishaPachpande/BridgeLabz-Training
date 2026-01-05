package campusconnect;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = null;
        Faculty faculty = null;
        Course course = null;

        int choice;

        do {
            System.out.println("\n====== Campus Connect ======");
            System.out.println("1. Create Faculty");
            System.out.println("2. Create Student");
            System.out.println("3. Create Course");
            System.out.println("4. Enroll Student to Course");
            System.out.println("5. Display Details");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Faculty Name: ");
                    String fname = sc.nextLine();

                    System.out.print("Enter Faculty Email: ");
                    String femail = sc.nextLine();

                    System.out.print("Enter Faculty ID: ");
                    int fid = sc.nextInt();

                    faculty = new Faculty(fname, femail, fid);
                    System.out.println("Faculty created successfully");
                    break;

                case 2:
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();

                    System.out.print("Enter Student Email: ");
                    String semail = sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Enter Student Grade (A/B/C/D): ");
                    char grade = sc.next().charAt(0);

                    student = new Student(sname, semail, sid, grade);
                    System.out.println("Student created successfully");
                    break;

                case 3:
                    if (faculty == null) {
                        System.out.println(" Create Faculty first");
                        break;
                    }

                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();

                    course = new Course(cname, faculty);
                    System.out.println("Course created successfully");
                    break;

                case 4:
                    if (student == null || course == null) {
                        System.out.println("Create Student and Course first");
                        break;
                    }

                    student.enrollCourse();
                    course.addStudent(student);
                    System.out.println("Student enrolled in course");
                    break;

                case 5:
                    if (student != null) student.printDetails();
                    if (faculty != null) faculty.printDetails();
                    if (course != null) course.displayStudentsList();
                    break;

                case 6:
                    System.out.println("Exited Campus Connect");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

    }
}
