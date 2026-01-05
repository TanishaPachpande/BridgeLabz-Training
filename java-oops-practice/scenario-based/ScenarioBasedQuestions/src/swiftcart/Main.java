package swiftcart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        int choice;

        do {
            System.out.println("\n===== SwiftCart Menu =====");
            System.out.println("1. Add Perishable Product");
            System.out.println("2. Add Non-Perishable Product");
            System.out.println("3. Apply Coupon Discount");
            System.out.println("4. Generate Bill");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Product Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    Product p1 = new PerishableProduct(pname, price, qty);
                    cart.addProduct(p1);
                    System.out.println(" Perishable product added");
                    break;

                case 2:
                    System.out.print("Enter Product Name: ");
                    String nname = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double nprice = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int nqty = sc.nextInt();

                    Product p2 = new NonPerishableProduct(nname, nprice, nqty);
                    cart.addProduct(p2);
                    System.out.println(" Non-Perishable product added");
                    break;

                case 3:
                    System.out.print("Enter Coupon Amount: ");
                    double coupon = sc.nextDouble();
                    cart.applyDiscount(coupon);
                    System.out.println(" Coupon applied");
                    break;

                case 4:
                    cart.generateBill();
                    break;

                case 5:
                    System.out.println("Thank you for shopping with SwiftCart 🛒");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
