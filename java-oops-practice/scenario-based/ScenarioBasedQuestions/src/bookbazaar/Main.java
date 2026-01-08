package bookbazaar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name:");
        String user = sc.nextLine();

        System.out.println("Choose Book Type:");
        System.out.println("1. EBook");
        System.out.println("2. Printed Book");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author Name:");
        String author = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        Book book;

        if (choice == 1) {
            book = new EBook(title, author, price);
        } else {
            System.out.println("Enter Stock:");
            int stock = sc.nextInt();
            book = new PrintedBook(title, author, price, stock);
        }

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        Order order = new Order(user, book, quantity);
        order.placeOrder();

        sc.close();
    }
}
