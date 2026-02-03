package com.streamapi;

import java.time.LocalDateTime;
import java.util.List;

public class LoggingTransactions {
	public static void main(String[] args) {
		List<String> ids = List.of("TX203","AX14","HX54","MX101","RX250");
		
		ids.forEach(id -> System.out.println(id+": "+LocalDateTime.now()));
	}
}
