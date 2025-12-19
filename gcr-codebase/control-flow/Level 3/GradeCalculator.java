import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks of three subjects.
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        // Calculate average (percentage)
        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

        // Determine grade and remarks
        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } 
        else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } 
        else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below but approaching agency-normalized standards");
        } 
        else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } 
        else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        } 
        else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }
    }
}
