package bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Polymorphism
    @Override
    public double applyDiscount() {
        return price * 0.10; // 10% discount
    }
}

