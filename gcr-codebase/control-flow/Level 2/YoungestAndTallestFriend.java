import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input age values of Amar, Akbar, and Anthony. 
        int ageOfAmar = input.nextInt();
        int ageOfAkbar = input.nextInt();
        int ageOfAnthony = input.nextInt();

        // Input height values of Amar, Akbar, and Anthony. 
        int heightOfAmar = input.nextInt();
        int heightOfAkbar = input.nextInt();
        int heightOfAnthony = input.nextInt();

        // Find the youngest friend and the tallest friend using min and max functions.
        int youngestFriend = Math.min(ageOfAmar, Math.min(ageOfAkbar, ageOfAnthony));
        int tallestFriend = Math.max(heightOfAmar, Math.max(heightOfAkbar, heightOfAnthony));

        // Display the results.
        System.out.println("Youngest Age is " + youngestFriend);
        System.out.println("Tallest Height is " + tallestFriend);
    }
}
