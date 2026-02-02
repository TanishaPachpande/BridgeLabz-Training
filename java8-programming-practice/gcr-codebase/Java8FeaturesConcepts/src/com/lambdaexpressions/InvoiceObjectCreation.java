package com.lambdaexpressions;

import java.util.List;

class Transaction{
	int id;

	public Transaction(int id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return "Invoice generated for transaction ID: " + id;
    }
}

public class InvoiceObjectCreation {
	public static void main(String[] args) {
		
		List<Integer> transactionIds = List.of(1,203,14,500);
		
		List<Transaction> invoices = transactionIds.stream().map(Transaction::new).toList();
		
		invoices.forEach(System.out::println);
	}
}
