package com.streamapi;

import java.util.List;

public class EventAttendeeWelcomeMessage {
	public static void main(String[] args) {
		List<String> attendees = List.of("Tanisha", "Aditya", "Harsh", "Vibha", "Namrata");
		
		attendees.stream().forEach(x -> {
			System.out.println("Welcome "+ x);
		});
	}
}
