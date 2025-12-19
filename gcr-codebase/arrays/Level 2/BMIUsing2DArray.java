import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Input the data.
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details of person " + (i + 1));

            // Weight input validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight. Enter positive value.");
                }
            } while (personData[i][0] <= 0);

            // Height input validation
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height. Enter positive value.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / 
                               (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
