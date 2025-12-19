import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();
        int counter = number - 1;
        int greatestFactor = 1;

        // find the greatest factor and break the while loop.
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Display the result.
        System.out.println("The greatest factor is " + greatestFactor);
    }
}
