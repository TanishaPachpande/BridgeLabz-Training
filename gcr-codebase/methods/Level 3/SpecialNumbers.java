import java.util.Scanner;

public class SpecialNumbers {

    //Check for Prime number
    static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0) return false;
        return true;
    }

    //Check for Neon number
    static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    //Check for Spy number
    static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number != 0) {
            int d = number % 10;
            sum += d;
            product *= d;
            number /= 10;
        }
        return sum == product;
    }

    //Check for Automorphic number
    static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Check for a number that is either divisible by 7 or ends with 7
    static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        
	// Input the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

	// Display the result
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
    }
}
