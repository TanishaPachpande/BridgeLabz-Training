package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product{
	String name;
	int price;
	double discount;
	int rating;
	
	public Product(String name, int price, double discount, int rating) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" |Price: "+price+" |Discount: "+discount+" |Rating: "+rating;
	}
}

public class CustomSortingEcommerce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// List of products
		List<Product> products = new ArrayList<>();
		
		// Adding Products into list
		products.add(new Product("Laptop", 70000, 4.5, 10));
        products.add(new Product("Mobile", 30000, 4.7, 15));
        products.add(new Product("Tablet", 25000, 4.2, 5));
        
        // Decide campaign to sort wrt
        System.out.print("Enter campaign to sort products(name/price/discount/rating):");
        String campaign = sc.next().toLowerCase();
		
		Comparator<Product> comparator = getComparator(campaign);
		
		Collections.sort(products, comparator);
		products.forEach(System.out::println);  // internally uses toString() method
		
//		Collections.sort(products, comparator.thenComparing(comparator).reversed());
//		System.out.println(products.toString());
		
	}
	
	static Comparator<Product> getComparator(String campaign){
		
		switch(campaign) {
		case "name":
			return (n1,n2)-> n1.name.compareTo(n2.name);
		case "price":
			return (p1, p2) -> p1.price-p2.price;
		case "discount":
			return (d1, d2) -> Double.compare(d1.discount, d2.discount);
		case "rating":
			return (r1, r2) -> r1.rating-r2.rating;
		default:
			throw new IllegalArgumentException("Invalid campaign");
		}
	}
	
}
