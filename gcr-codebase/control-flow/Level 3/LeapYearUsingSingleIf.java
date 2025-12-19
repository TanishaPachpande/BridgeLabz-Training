import java.util.Scanner;

public class LeapYearUsingSingleIf {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input the value of year variable.
        int year = input.nextInt();

        // Check for leap and non-leap year by using logical operators, and display the result.
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
