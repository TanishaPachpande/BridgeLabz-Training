import java.util.Scanner;

public class SumOfUserInputValues{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // input a double type value.
        double value=input.nextDouble();
        double total = 0.0;

        // Enter value till the user enters 0 and sum the entered values.
        while(value!=0){
            total+=value;
            value=input.nextDouble();
        }

        // Display the result.
        System.out.println("The Total value is "+total);
    }
}
