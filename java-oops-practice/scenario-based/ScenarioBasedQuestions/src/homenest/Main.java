package homenest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Device ID:");
        int id = sc.nextInt();

        System.out.println("Enter Energy Usage per hour:");
        double energy = sc.nextDouble();

        System.out.println("Select Device Type:");
        System.out.println("1. Light\n2. Camera\n3. Thermostat\n4. Lock");
        int choice = sc.nextInt();

        Device device = null;

        switch (choice) {
            case 1:
                device = new Light(id, energy);
                break;
            case 2:
                device = new Camera(id, energy);
                break;
            case 3:
                device = new Thermostat(id, energy);
                break;
            case 4:
                device = new Lock(id, energy);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        device.turnOn();

        System.out.println("Enter usage hours:");
        double hours = sc.nextDouble();

        System.out.println("Total Energy Used: " +
                device.calculateTotalEnergy(hours) + " units");

        device.reset();
        device.turnOff();

        sc.close();
    }
}

