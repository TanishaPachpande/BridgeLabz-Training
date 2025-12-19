import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take an integer value as user input.
        int number = input.nextInt();

        // Check for a natural number.
        if (number <= 0) {
            System.out.println("Enter a natural number");
            return;
        }

        // Find the even and odd values and display the result.
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
