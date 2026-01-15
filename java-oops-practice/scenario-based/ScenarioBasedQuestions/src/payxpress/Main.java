package payxpress;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Bill Type:");
        System.out.println("1. Electricity\n2. Internet\n3. Water");
        int choice = sc.nextInt();

        System.out.print("Enter Bill Amount: ");
        double amount = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter Due Date (DD-MM-YYYY): ");
        String dueDate = sc.nextLine();

        Bill bill;

        switch (choice) {
            case 1:
                bill = new ElectricityBill(amount, dueDate);
                break;
            case 2:
                bill = new InternetBill(amount, dueDate);
                break;
            case 3:
                bill = new WaterBill(amount, dueDate);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        bill.sendReminder();

        System.out.print("\nDo you want to pay now? (yes/no): ");
        String payChoice = sc.nextLine();

        if (payChoice.equalsIgnoreCase("yes")) {
            bill.pay();
        } else {
            System.out.println("Payment pending.");
        }

        sc.close();
    }
}

