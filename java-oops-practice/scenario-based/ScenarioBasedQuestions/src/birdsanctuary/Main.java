package birdsanctuary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();
        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Delete Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Bird Type: ");
                    String type = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    Bird bird = null;

                    switch (type.toLowerCase()) {
                        case "eagle": bird = new Eagle(name, id); break;
                        case "duck": bird = new Duck(name, id); break;
                        case "penguin": bird = new Penguin(name, id); break;
                        case "seagull": bird = new Seagull(name, id); break;
                        case "ostrich": bird = new Ostrich(name, id); break;
                        default:
                            System.out.println("Unknown bird type");
                            continue;
                    }
                    sanctuary.addBird(bird);
                    break;

                case 2:
                    sanctuary.displayAll();
                    break;

                case 3:
                    sanctuary.displayFlyingBirds();
                    break;

                case 4:
                    sanctuary.displaySwimmingBirds();
                    break;

                case 5:
                    System.out.print("Enter Bird ID to delete: ");
                    sanctuary.deleteBird(sc.nextLine());
                    break;

                case 6:
                    sanctuary.sanctuaryReport();
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}
