import java.util.Scanner;

public class QuotientAndRemainder{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input the number and divisor values.
        int number = input.nextInt();
        int divisor = input.nextInt();

        // Call a method to find the Quotient and remainder.
        int[] result = findRemainderAndQuotient(number, divisor);
        int remainder = result[0];
        int quotient = result[1];

        // Display the Result.
        System.out.println("The Number "+number+" has quotient "+quotient+" and remainder "+remainder);
    }

    // Method to find the Quotient and remainder.
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder=number%divisor;
        int quotient=number/divisor;
        return new int[]{remainder, quotient};
    }
}
