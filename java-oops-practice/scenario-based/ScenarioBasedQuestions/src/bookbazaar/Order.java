package bookbazaar;

public class Order {

    private String userName;
    private Book book;
    private int quantity;

    private String orderStatus = "CREATED"; // restricted access

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
    }

    public void placeOrder() {

        if (book.isAvailable(quantity)) {

            double totalCost =
                    book.getPriceAfterDiscount() * quantity;

            book.reduceStock(quantity);
            orderStatus = "CONFIRMED";

            System.out.println("Order Confirmed ✅");
            System.out.println("User: " + userName);
            System.out.println("Total Amount: ₹" + totalCost);
        } else {
            orderStatus = "FAILED";
            System.out.println("Insufficient stock ❌");
        }
    }
}
