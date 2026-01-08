package DataStructureInOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Product p1 = new Product("dress", 2, 1000);
		Product p2 = new Product("pen", 3, 10);
		Product p3 = new Product("bottle", 1, 50);
		
		List<Product> list = new ArrayList<>();
		
		Cart c =new Cart(list);
		c.addProduct(p1);
		c.addProduct(p2);
		c.addProduct(p3);
		c.displayCartItems();
	}
}
