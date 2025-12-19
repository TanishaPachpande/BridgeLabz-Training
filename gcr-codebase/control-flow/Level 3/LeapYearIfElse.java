import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input the value of year variable.
        int year = input.nextInt();

        // Check for leap and non-leap year, and display the result.
        if (year < 1582) {
            System.out.println("Invalid Year");
        } 
        else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
