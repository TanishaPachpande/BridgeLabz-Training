import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number = input.nextInt();

        // Initialize variables
        int sum = 0;
        int temp = number;

        // Find sum of digits using while loop
        while (temp != 0) {
            int digit = temp % 10;  
            sum = sum + digit;      
            temp = temp / 10;       
        }

        // Check Harshad condition
        if (number % sum == 0)
            System.out.println(number +" is a Harshad Number");
        else
            System.out.println(number +" is not a Harshad Number");
    }
}
