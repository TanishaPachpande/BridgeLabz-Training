package artify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name:");
        String userName = sc.nextLine();

        System.out.println("Enter Wallet Balance:");
        double balance = sc.nextDouble();

        User user = new User(userName, balance);

        sc.nextLine(); // consume newline

        System.out.println("Enter Artwork Title:");
        String title = sc.nextLine();

        System.out.println("Enter Artist Name:");
        String artist = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        sc.nextLine();

        System.out.println("Choose Art Type: 1. Digital Art  2. Print Art");
        int choice = sc.nextInt();

        Artwork artwork;

        if (choice == 1) {
            artwork = new DigitalArt(title, artist, price, "Digital License");
        } else {
            artwork = new PrintArt(title, artist, price, "Print License");
        }

        System.out.println("\n--- Artwork Details ---");
        artwork.display();

        System.out.println("\nApplying License:");
        artwork.license();     // polymorphism

        System.out.println("\nPurchasing Artwork...");
        artwork.purchase(user);

        System.out.println("\n--- Updated User Details ---");
        user.displayUser();

        sc.close();
    }
}

