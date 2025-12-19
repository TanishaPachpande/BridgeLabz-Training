import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input an integer value;
        int number = input.nextInt();
        int i = 1;

        // Display the result accordingly by using while loop for multiples of 3 and 5.
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }
}
