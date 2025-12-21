import java.util.Arrays;
import java.util.Scanner;

public class PalindromeDuckNumber {

    static int[] storeDigits(int number) {
        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Reverse array
    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    // Compare arrays
    static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Palindrome check
    static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        return compareArrays(digits, reverseArray(digits));
    }

    // Duck number check
    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {

        // Input the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

	// Display the result
        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Duck Number: " + isDuck(digits));
    }
}
