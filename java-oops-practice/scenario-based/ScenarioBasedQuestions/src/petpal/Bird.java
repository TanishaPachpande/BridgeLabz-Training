package petpal;

public class Bird extends Pet {

    public Bird(String name) {
        super(name, "Bird");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp Chirp!");
    }
}
