package gamebox;

public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Operator usage – seasonal offer
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    @Override
    public abstract void playDemo(); // Polymorphism
}

