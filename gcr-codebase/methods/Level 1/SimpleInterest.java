import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Input the values of principle, rate, and time.
        int principle = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();

        // Calculate the simple interest through method.
        double simpleInterest = findSimpleInterest(principle, rate, time);

        // Display the result.
        System.out.println("The Simple Interest is "+ simpleInterest+ " for Principle "+principle+", Rate of Interest "+ rate+ " and Time "+time);
    }

    // Method to find the simple interest.
    public static double findSimpleInterest(int principle, int rate, int time){
        return (double)(principle*rate*time)/100;
    }
}
