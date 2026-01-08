package bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price);
    }

    // Polymorphism
    @Override
    public double applyDiscount() {
        return price * 0.20; // 20% discount
    }
}
