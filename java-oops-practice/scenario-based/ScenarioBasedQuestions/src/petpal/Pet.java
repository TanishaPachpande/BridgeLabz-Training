package petpal;
import java.util.Random;

public class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated variables
    private int hunger;
    private int energy;
    private int mood;

    // Random constructor
    public Pet(String name, String type) {
        Random r = new Random();
        this.name = name;
        this.type = type;
        this.age = r.nextInt(10) + 1;
        this.hunger = r.nextInt(50);
        this.energy = r.nextInt(50);
        this.mood = r.nextInt(50);
    }

    // User-defined constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 30;
        this.energy = 30;
        this.mood = 30;
    }

    // Encapsulation: modify only via methods
    public void feed() {
        hunger -= 10;
        mood += 5;
        System.out.println(name + " is eating.");
    }

    public void play() {
        energy -= 10;
        mood += 10;
        hunger += 5;
        System.out.println(name + " is playing.");
    }

    public void sleep() {
        energy += 15;
        hunger += 5;
        System.out.println(name + " is sleeping.");
    }

    public void showStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    // Polymorphism
    public void makeSound() {
        System.out.println("Pet makes a sound");
    }
}
