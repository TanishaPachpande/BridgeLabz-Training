import java.util.Scanner;

public class NumberOfChocolates{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input the two integer values.
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        // Call a method to find the Chocolates per student and the remaining ones.
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        int remainder = result[0];
        int quotient = result[1];

        // Display the Result.
        System.out.println("Chocolates per children are "+ quotient+" and the remaining chocolates are "+ remainder);
    }

    // Method to find the Chocolates per student and the remaining ones.
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren){
        int remainder=numberOfChocolates%numberOfChildren;
        int quotient=numberOfChocolates/numberOfChildren;
        return new int[]{remainder, quotient};
    }
}
