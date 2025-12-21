import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Input the number.
        int number = input.nextInt();

        // Check the number is positive, negative, or zero.
        int result = checkNumber(number);

        // Display the result.
        System.out.println("The Result is " + result);
    }

    // Method to find the Number is positive, negative, or zero.
    public static int checkNumber(int number){
        if(number==0){
            return 0;
        }else if(number<0){
            return -1;
        }else{
            return 1;
        }
    }
}
