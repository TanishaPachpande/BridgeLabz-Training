import java.util.Scanner;

public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values of number ad power variable.
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;
        int counter = 0;

        // Calculate the number to the given power using while loop.
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Display the result
        System.out.println("The result of number "+number+ " to the power "+power+" is "+result);
    }
}
