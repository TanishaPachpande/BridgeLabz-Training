package com.streamapi;

import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Integer> stockPrices = List.of(200, 500, 650, 450, 900, 825);
		
		stockPrices.stream().forEach(x-> System.out.println("Stock Price update: "+x));
	}
}
