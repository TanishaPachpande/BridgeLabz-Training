import java.util.Scanner;

public class CounterDownByForLoop{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner sc = new Scanner(System.in);

        // Input value for counter.
        int counter = sc.nextInt();

        // Print the counter value till 1 using for loop.
        for(int i=counter;i>=1;i--){
              System.out.println(i);
        }
    }
}
