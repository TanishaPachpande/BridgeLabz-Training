import java.util.Scanner;

public class TeamBMI {

    // Method to calculate BMI and populate 3rd column
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];

            // Convert height from cm to meter
            double heightMeter = heightCm / 100;

            personData[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][3];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Get BMI status
	String[] bmiStatus = determineBMIStatus(personData);

        // Display results
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + bmiStatus[i]);
        }

        sc.close();
    }
}
