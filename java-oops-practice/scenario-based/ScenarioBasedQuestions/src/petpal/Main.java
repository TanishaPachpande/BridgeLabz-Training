package petpal;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy");
        Pet cat = new Cat("Kitty");
        Pet bird = new Bird("Tweety");

        dog.makeSound();
        dog.feed();
        dog.play();
        dog.showStatus();

        System.out.println();

        cat.makeSound();
        cat.sleep();
        cat.showStatus();

        System.out.println();

        bird.makeSound();
        bird.play();
        bird.showStatus();
    }
}
