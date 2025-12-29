import java.util.Scanner;

public class PhoneRechargeSimulator {

    // Initial balance constant
    static double balance = 0.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // Take mobile operator input
            System.out.println("\nSelect Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.print("Enter your choice (1-3): ");
            int operator = sc.nextInt();

            // Take recharge amount
            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            // Add amount to balance
            balance += amount;

            // Switch for offers
            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: Extra 1GB/day for 5 days!");
                    break;
                case 2:
                    System.out.println("Airtel Offer: Unlimited calls for 7 days!");
                    break;
                case 3:
                    System.out.println("VI Offer: Extra 2GB data!");
                    break;
                default:
                    System.out.println("Invalid Operator Selected!");
            }

            // Show balance after recharge
            System.out.println("Current Balance: ₹" + balance);

	    System.out.println("===================================================");
            // Loop for repeated recharge
            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator.");
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
