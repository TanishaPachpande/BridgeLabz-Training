package com.lambdaexpressions;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Alert{
	String message;
	String type;
	
	public Alert(String message, String type) {
		this.message = message;
		this.type = type;
	} 
	
	@Override
	public String toString() {
		return type+" : "+message;
	}
}

public class NotificationFiltering {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Alert> alerts = List.of(new Alert("High Blood pressure","emergency"), new Alert("health improvement tips","general"), new Alert("Suffocation and vomitting","emergency"));
		
		Predicate<Alert> emergencyAlert = (n) -> n.type.equals("emergency");
		Predicate<Alert> generalAlert = (n) -> n.type.equals("general");
		Predicate<Alert> combinedAlert = (n) -> n.type.equals("general")|| n.type.equals("general");
		
		System.out.println("Emergency Alerts:");
		alerts.stream().filter(emergencyAlert).forEach(System.out::println);
		
		System.out.println("General Alerts:");
		alerts.stream().filter(generalAlert).forEach(System.out::println);
		
		System.out.println("General + Emergency Alerts:");
		alerts.stream().filter(combinedAlert).forEach(System.out::println);
		
		sc.close();
	}
}
