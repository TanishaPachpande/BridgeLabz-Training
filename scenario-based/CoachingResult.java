import java.util.Scanner;

public class CoachingResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	// Input the marks of all 5 subjects
        int total = 0;
        int subjects = 5;
        int[] marks = new int[subjects];

        // Input marks using for-loop and find sum
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        int average = total / subjects;
        System.out.println("\nAverage Marks: " + average);

        // Switch case for grade assignment
        switch (average / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: Fail");
        }
    }
}
