import java.util.Scanner;

public class DivisorBasedNumbers {

    //Check for Perfect number
    static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;
        return sum == number;
    }

    //Check for Abundant number
    static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;
        return sum > number;
    }

    //Check for Deficient number
    static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;
        return sum < number;
    }

    // Method to find factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    //Check for Strong number
    static boolean isStrong(int number) {
        int temp = number, sum = 0;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        
	// Input the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

	// Display the result
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
}
