import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input an integer value
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create an array of digits of 10 size.
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Insert elements into digit array.
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0, secondLargest = 0;

        // Find the largest and second largest digit.
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the result.
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);


    }
}
