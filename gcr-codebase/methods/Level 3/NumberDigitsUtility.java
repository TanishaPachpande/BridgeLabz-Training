import java.util.Scanner;

public class NumberDigitsUtility {

    // Method to count the number of digits
    static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of a number in an array
    static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of digits
    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to find the sum of squares
    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    // Check for Harshad number
    static boolean isHarshad(int number) {
        int[] digits = storeDigits(number);
        return number % sumOfDigits(digits) == 0;
    }

    public static void main(String[] args) {

        // Input the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

	// Display the result.
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number));
    }
}
