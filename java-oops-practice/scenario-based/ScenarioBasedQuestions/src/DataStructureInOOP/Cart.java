package DataStructureInOOP;

import java.util.List;

public class Cart {
	
	List<Product> products;

	public Cart(List<Product> products) {
		super();
		this.products = products;
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public void displayCartItems() {
		for(Product product: products) {
			product.displayDetails();
		}
	}
	
}
