package birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String name, String id) {
        super(name, "Seagull", id);
    }

    public void fly() {
        System.out.println("Seagull glides over the sea.");
    }

    public void swim() {
        System.out.println("Seagull floats on water.");
    }
}

