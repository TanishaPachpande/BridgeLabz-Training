package com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    String name;
    double amount;

    public Order(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}

public class OrderRevenueSummary {
	public static void main(String[] args) {
		
		List<Order> orders = List.of(
                new Order("Alice", 1200),
                new Order("Bob", 800),
                new Order("Alice", 300),
                new Order("Bob", 700),
                new Order("Charlie", 500)
        );
		
		Map<String, Double> revenue = orders.stream()
				.collect(Collectors.groupingBy(
						s -> s.name,
						Collectors.summingDouble(s -> s.amount)
						));
		
		revenue.forEach((name, total)->System.out.println(name+" -> "+total));
	}
}
