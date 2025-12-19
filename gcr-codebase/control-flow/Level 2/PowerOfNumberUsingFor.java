import java.util.Scanner;

public class PowerOfNumberUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values of number ad power.
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;

        // Calculate the number to the given power using for loop.
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result.
        System.out.println("The result of number "+number+ " to the power "+power+" is "+result);
    }
}
