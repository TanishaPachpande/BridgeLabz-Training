package gamebox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        User user = new User(username);

        System.out.println("\nSelect Game Type:");
        System.out.println("1. Arcade Game\n2. Strategy Game");
        int choice = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Game Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Price (0 for free game): ");
        double price = sc.nextDouble();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        Game game;

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        System.out.print("Apply seasonal discount? (yes/no): ");
        sc.nextLine();
        String offer = sc.nextLine();

        if (offer.equalsIgnoreCase("yes")) {
            System.out.print("Enter discount percentage: ");
            double percent = sc.nextDouble();
            game.applyDiscount(percent);
        }

        System.out.println("Final Price: " + game.getPrice());

        game.playDemo();
        game.download();
        user.buyGame(game);

        user.showOwnedGames();
        sc.close();
    }
}

