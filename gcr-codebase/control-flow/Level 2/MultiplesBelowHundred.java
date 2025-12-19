import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();

        // Check the number is in range of 0 to 100 or Not.
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }

        // display the multiples of input number present below 100.
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0)
                System.out.println(i);
        }
    }
}
