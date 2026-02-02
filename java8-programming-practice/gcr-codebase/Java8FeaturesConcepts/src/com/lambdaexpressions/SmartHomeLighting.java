package com.lambdaexpressions;

import java.util.Scanner;

// Creating Functional Interface with one abstract method
@FunctionalInterface
interface LightActivation{
	void behaviour();
}

public class SmartHomeLighting {
	public static void main(String[] args) {
		
		// one trigger, one line
		LightActivation motionTrigger = () -> System.out.println("White Light On");;
		LightActivation nightTrigger = () -> System.out.println("Dim Light On");;
		LightActivation voiceTrigger = () -> System.out.println("Blue Light On");;
		
		// Dynamically calling at runtime
		activateLight(motionTrigger);
		activateLight(nightTrigger);
		activateLight(voiceTrigger);
	}
	
	// Function to execute at runtime
	static void activateLight(LightActivation trigger) {
		trigger.behaviour();
	}
}
