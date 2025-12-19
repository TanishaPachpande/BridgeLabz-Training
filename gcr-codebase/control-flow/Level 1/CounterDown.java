import java.util.Scanner;

public class CounterDown{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner sc = new Scanner(System.in);

        // Input value for counter.
        int counter = sc.nextInt();

        // Print counter value till 1 using while loop.
        while(counter>=1){
             System.out.println(counter);
             counter--;
        }
    }
}
