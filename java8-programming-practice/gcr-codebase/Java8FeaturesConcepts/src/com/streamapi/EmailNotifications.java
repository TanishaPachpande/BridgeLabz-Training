package com.streamapi;

import java.util.List;

public class EmailNotifications {
	public static void main(String[] args) {
		List<String> emails = List.of("tanisha@gmail.com","aditya@gmail.com","harsh@gmail.com","vibha@gmail.com");
		
		emails.forEach(e-> sendEmailNotification(e));
	}
	
	public static void sendEmailNotification(String email) {
		System.out.println("Notification email sent to: " + email);
	}

}
