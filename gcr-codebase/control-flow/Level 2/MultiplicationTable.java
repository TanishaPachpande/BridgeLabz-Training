import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input the value of number.
        int number = input.nextInt();

        // Display the table by using for loop
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
