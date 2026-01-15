package com.examproctor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();

        while (true) {
            System.out.println("\n--- Online Exam Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. View Navigation History");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID: ");
                    exam.visitQuestion(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    String ans = sc.nextLine();
                    exam.submitAnswer(qId, ans);
                    break;

                case 3:
                    exam.showNavigationHistory();
                    break;

                case 4:
                    exam.submitExam();
                    System.exit(0);
            }
        }
    }
}

