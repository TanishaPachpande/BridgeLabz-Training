import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();

        // Initialize count
        int count = 0;

        // While loop until number becomes 0
        while (number != 0) {
            number = number / 10; 
            count++;              
        }

        // Display the result
        System.out.println("Number of digits: " + count);
    }
}
