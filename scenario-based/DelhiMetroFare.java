import java.util.Scanner;

public class DelhiMetroFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	// input balance value
        double balance = 200.0;
        char choice;

        do {
            System.out.println("\nCurrent Smart Card Balance: ₹" + balance);

            System.out.print("Enter distance travelled (in km): ");
            int distance = sc.nextInt();

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }

            if (balance <= 0) {
                System.out.println("Balance exhausted. Journey ended.");
                break;
            }

	    System.out.print("===========================================");
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Delhi Metro.");
    }
}
