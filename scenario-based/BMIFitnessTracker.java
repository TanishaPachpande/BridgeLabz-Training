import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take height input in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Take weight input in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculate BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }
    }
}
