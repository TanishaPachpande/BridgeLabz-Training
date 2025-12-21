import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input the three numbers.
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        // Call a method to find the largest and smallest number.
        int[] result = findSmallestAndLargest(number1, number2, number3);
        int smallest = result[0];
        int largest = result[1];

        // Display the Result.
        System.out.println("The Largest number is "+largest+" and the Smallest number is "+smallest);
    }

    // Method to find the largest and smallest number.
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int minimum=Math.min(number1, Math.min(number2, number3));
        int maximum=Math.max(number1, Math.max(number2, number3));
        return new int[]{minimum, maximum};
    }
}
