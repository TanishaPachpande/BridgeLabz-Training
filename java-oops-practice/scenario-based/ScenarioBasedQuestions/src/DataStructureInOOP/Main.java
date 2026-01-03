package DataStructureInOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Product p1 = new Product("dress", 2, 1000);
		Product p2 = new Product("pen", 3, 10);
		Product p3 = new Product("bottle", 1, 50);
		
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Cart c =new Cart(list);
		c.displayCartItems();
	}
}
