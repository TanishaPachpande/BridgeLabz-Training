import java.util.Scanner;

public class FizzBuzzUsingForLoop {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner sc = new Scanner(System.in);

        // Input an integer value;
        int number = sc.nextInt();

        // Check for a positive number entered or not.
        if (number <= 0) {
            System.out.println("Enter positive number");
            return;
        }

        // Display the result accordingly by using while loop for multiples of 3 and 5.
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
