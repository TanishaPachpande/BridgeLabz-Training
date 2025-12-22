import java.util.Scanner;

public class StudentScorecard {

    // function to generate random 2-digit PCM scores
    static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // function to calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = avg;

            // rounding to 2 digits
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    // function to calculate grade based on percentage
    static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];

            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Displaying scorecard
    static void displayScorecard(int[][] scores, double[][] results, String[] grades) {

        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        // Output
        displayScorecard(scores, results, grades);

    }
}
