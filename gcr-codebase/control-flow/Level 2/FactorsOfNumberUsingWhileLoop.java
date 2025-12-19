import java.util.Scanner;

public class FactorsOfNumberUsingWhileLoop {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Take an integer as input
        int number = input.nextInt();
        int i = 1;

        // Find the factors of a number using while loop.
        while (i < number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
