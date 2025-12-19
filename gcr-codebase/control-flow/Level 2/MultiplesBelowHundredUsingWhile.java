import java.util.Scanner;

public class MultiplesBelowHundredUsingWhile {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();
        int counter = 100;

        // Display the multiples of given number below hundred.
        while (counter >= 1) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
    }
}
