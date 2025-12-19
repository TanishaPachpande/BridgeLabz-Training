import java.util.Scanner;

public class GreatestFactorUsingForLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();
        int greatestFactor = 1;

        // find the greatest factor and break the for loop.
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the result.
        System.out.println("The greatest factor is "+ greatestFactor);
    }
}
