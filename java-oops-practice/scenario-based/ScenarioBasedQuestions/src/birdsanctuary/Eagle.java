package birdsanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

