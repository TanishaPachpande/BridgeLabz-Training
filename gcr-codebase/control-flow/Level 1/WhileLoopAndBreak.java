import java.util.Scanner;

public class WhileLoopAndBreak{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input a double type value.
        double value=input.nextDouble();
        double total = 0.0;

        // Enter input until the user enters negative or zero and sum the values.
        while(true){
            if(value<=0){
                  break;
            }
            total+=value;
            value=input.nextDouble();
        }

        // Display the result.
        System.out.println("The Total value is "+total);
    }
}
