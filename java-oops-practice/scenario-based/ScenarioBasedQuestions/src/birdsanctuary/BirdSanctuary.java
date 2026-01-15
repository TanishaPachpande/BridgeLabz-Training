package birdsanctuary;

import java.util.ArrayList;

public class BirdSanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void displayAll() {
        for (Bird b : birds) {
            b.displayInfo();
            b.eat();

            if (b instanceof Flyable)
                ((Flyable) b).fly();

            if (b instanceof Swimmable)
                ((Swimmable) b).swim();

            System.out.println();
        }
    }

    public void displayFlyingBirds() {
        for (Bird b : birds)
            if (b instanceof Flyable)
                b.displayInfo();
    }

    public void displaySwimmingBirds() {
        for (Bird b : birds)
            if (b instanceof Swimmable)
                b.displayInfo();
    }

    public void deleteBird(String id) {
        birds.removeIf(b -> b.getId().equals(id));
        System.out.println("Bird removed if ID existed.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}


