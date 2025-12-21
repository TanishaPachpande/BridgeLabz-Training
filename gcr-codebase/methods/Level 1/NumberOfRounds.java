import java.util.Scanner;

public class NumberOfRounds {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Input the three sides of a triangle in meters.
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        // Convert distance in kilometers into meters.
        int distanceinKm=5;
        int distanceInM=distanceinKm*1000;

        // Calculate the maximum number of rounds through method.
        int numberOfRounds = findNumberOfRounds(side1, side2, side3, distanceInM);

        // Display the result.
        System.out.println("The Number of Rounds are " + numberOfRounds);
    }

    // Method to find the Number of Rounds.
    public static int findNumberOfRounds(int side1, int side2, int side3, int distanceInM){
        int perimeterOfTriangle=side1+side2+side3;
        return distanceInM/perimeterOfTriangle;
    }
}
