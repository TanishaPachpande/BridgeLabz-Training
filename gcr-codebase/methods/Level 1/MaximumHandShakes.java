import java.util.Scanner;

public class MaximumHandShakes {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Input the number of students.
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes through method.
        double maximumHandShakes = findMaximumHandShakes(numberOfStudents);

        // Display the result.
        System.out.println("The Number of Possible HandShakes: " + maximumHandShakes);
    }

    // Method to find the Number of Possible HandShakes.
    public static double findMaximumHandShakes(int numberOfStudents){
        return (double)((numberOfStudents*(numberOfStudents-1))/2);
    }
}
