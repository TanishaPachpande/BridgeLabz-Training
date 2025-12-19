import java.util.Scanner;

public class FactorsOfNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();

        // Check for invalid inputs like negative or zero.
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Find the factors of a number and display the result.
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}
