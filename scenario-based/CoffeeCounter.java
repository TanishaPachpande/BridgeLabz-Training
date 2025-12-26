import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String coffeeType;

        while (true) {

            System.out.println("\nEnter coffee type (Espresso/Latte/Cappuccino/Americano) or type 'exit' to stop:");
            coffeeType = sc.next();

            // Stop condition if user entered exit as input
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Café ☕");
                break;
            }

            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();

            double price = 0;

            // Switch to decide coffee price
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                case "americano":
                    price = 110;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            // Bill calculation
            double total = price * quantity;
            double gst = total * 0.05;   // 5% GST
            double finalBill = total + gst;

	    // Displaying result
            System.out.println("Total amount: " + total);
            System.out.println("GST (5%): " + gst);
            System.out.println("Final Bill: " + finalBill);
        }
    }
}
