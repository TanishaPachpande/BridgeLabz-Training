package artify;

public class Artwork implements IPurchasable {

    private String title;
    private String artist;
    protected double price;              // protected for inheritance
    protected String licenseType;         // encapsulation

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview (overloading)
    public Artwork(String title, String artist, double price, String licenseType, boolean preview) {
        this(title, artist, price, licenseType);
        System.out.println("Preview available: " + preview);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.setWalletBalance(user.getWalletBalance() - price); // operator usage
            System.out.println("Artwork purchased successfully!");
        } else {
            System.out.println("Insufficient wallet balance!");
        }
    }

    @Override
    public void license() {
        System.out.println("Standard License: " + licenseType);
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Price: " + price);
    }
}

