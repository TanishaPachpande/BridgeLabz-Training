package bookbazaar;

public class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;   // encapsulated inventory

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Optional offer constructor
    public Book(String title, String author, double price) {
        this(title, author, price, 10);
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    // inventory updated only via method
    public void reduceStock(int quantity) {
        stock -= quantity;
    }

    public double applyDiscount() {
        return 0; // base book has no discount
    }

    public double getPriceAfterDiscount() {
        return price - applyDiscount();
    }

    public void showBook() {
        System.out.println(title + " by " + author + " | Price: ₹" + price);
    }
}

