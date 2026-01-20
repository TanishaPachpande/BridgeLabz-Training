package bagnball;


import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bag> bags = new ArrayList<>();

        System.out.print("Enter number of bags: ");
        int bagCount = sc.nextInt();

        for (int i = 0; i < bagCount; i++) {
            System.out.println("Enter Bag ID, Color, Capacity:");
            String id = sc.next();
            String color = sc.next();
            int capacity = sc.nextInt();

            bags.add(new Bag(id, color, capacity));
        }

        int choice;
        do {
            System.out.println("\n--- Toy Organizer Menu ---");
            System.out.println("1. Add Ball");
            System.out.println("2. Remove Ball");
            System.out.println("3. Display Balls in Bag");
            System.out.println("4. Display All Bags");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.next();

                    System.out.print("Enter Ball ID, Color, Size: ");
                    Ball ball = new Ball(sc.next(), sc.next(), sc.next());

                    bags.stream()
                        .filter(b -> b.getId().equals(bagId))
                        .findFirst()
                        .ifPresentOrElse(
                            b -> {
                                if (!b.addBall(ball)) {
                                    System.out.println("Bag is full!");
                                }
                            },
                            () -> System.out.println("Bag not found!")
                        );
                    break;

                case 2:
                    System.out.print("Enter Bag ID and Ball ID: ");
                    bagId = sc.next();
                    String ballId = sc.next();

                    bags.stream()
                        .filter(b -> b.getId().equals(bagId))
                        .findFirst()
                        .ifPresentOrElse(
                            b -> {
                                if (!b.removeBall(ballId)) {
                                    System.out.println("Ball not found!");
                                }
                            },
                            () -> System.out.println("Bag not found!")
                        );
                    break;

                case 3:
                    System.out.print("Enter Bag ID: ");
                    bagId = sc.next();

                    bags.stream()
                        .filter(b -> b.getId().equals(bagId))
                        .findFirst()
                        .ifPresentOrElse(
                            Bag::displayBalls,
                            () -> System.out.println("Bag not found!")
                        );
                    break;

                case 4:
                    bags.forEach(b ->
                        System.out.println("Bag ID: " + b.getId() +
                                " | Balls Count: " + b.getBallCount()));
                    break;
            }

        } while (choice != 0);

        sc.close();
        System.out.println("Thank you for using Toy Organizer!");
    }
}

