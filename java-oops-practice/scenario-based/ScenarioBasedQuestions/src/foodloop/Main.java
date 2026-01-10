package foodloop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.println("\n1. Add Veg Item");
            System.out.println("2. Add Non-Veg Item");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");

            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Veg Item Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                order.addItem(new VegItem(name, price, 5));
            }

            else if (choice == 2) {
                System.out.print("Enter Non-Veg Item Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                order.addItem(new NonVegItem(name, price, 5));
            }

            else if (choice == 3) {
                order.showOrder();
                order.placeOrder();
                break;
            }

            else if (choice == 4) {
                order.cancelOrder();
                break;
            }

            else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}

