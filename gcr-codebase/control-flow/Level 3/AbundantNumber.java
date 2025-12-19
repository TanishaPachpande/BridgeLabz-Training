import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();

        // Initialize sum
        int sum = 0;

        // Find the sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check Abundant condition and display the results.
        if (sum > number)
            System.out.println(number+" is an Abundant Number");
        else
            System.out.println(number+" is not an Abundant Number");
    }
}
