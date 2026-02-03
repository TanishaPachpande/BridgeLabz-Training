package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Claim{
	String type;
	double amount;

	public Claim(String type, double amount) {
		this.type = type;
		this.amount=amount;
	}
}

public class InsuranceClaimAnalysis {
	public static void main(String[] args) {
		List<Claim> claims = new ArrayList<>();
		
		claims.add(new Claim("abc", 100));
		claims.add(new Claim("def", 200));
		claims.add(new Claim("abc", 300));
		claims.add(new Claim("def", 100));
		claims.add(new Claim("def", 300));
		
		Map<String, Double> claimAvg = claims.stream()
		.collect(Collectors.groupingBy(c -> c.type, 
				Collectors.averagingDouble(c -> c.amount)));
		
		claimAvg.forEach((type,avg) -> System.out.println(type+" : "+avg));
	}
}
