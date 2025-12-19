import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the value of number variable.
        int number = input.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean isPrime = true;

        // Check divisibility from 2 to number-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Display the result.
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
