import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    // Constants for discount rates
    public static final double DISCOUNT_20 = 0.20;
    public static final double DISCOUNT_10 = 0.10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();

        double totalBill = 0.0;

        // Input item prices using for-loop
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalBill += price;
        }

        double discount = 0.0;

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT_10;
        } else {
            discount = 0.0;
        }

        double finalAmount = totalBill - discount;

        // Output results
        System.out.println("\n---------- Bill Summary ----------");
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + finalAmount);
    }
}
