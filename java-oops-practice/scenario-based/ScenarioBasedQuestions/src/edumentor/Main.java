package edumentor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // User Input for Learner
        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Type (short/full-time): ");
        String courseType = sc.nextLine();

        Learner learner = new Learner(name, email, userId, courseType);

        // Quiz Data
        String[] questions = {
                "1. What is Java?\n1) OS\n2) Programming Language\n3) Browser\n4) Device",
                "2. Which keyword is used for inheritance?\n1) this\n2) final\n3) extends\n4) super"
        };

        int[] answers = {2, 3};

        Quiz quiz = new Quiz(questions, answers, 2);

        // Start Quiz
        quiz.conductQuiz();
        quiz.displayResult();

        // Certificate Generation
        learner.generateCertificate();
	}
}
