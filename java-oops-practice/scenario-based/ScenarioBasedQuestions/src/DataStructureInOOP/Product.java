package DataStructureInOOP;

public class Product {
	String productName;
	int quantity;
	int price;
	
	public Product(String productName, int quantity, int price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getTotalPrice() {
		return quantity*price;
	}
	
	public void displayDetails() {
		System.out.println("Product Name: "+ productName);
		System.out.println("Quantity: "+ quantity);
		System.out.println("Total Price: "+ getTotalPrice());
		System.out.println("-------------------------------");
	}
}
