package com.factoryrobothazardanalyzer;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		RobotHazardAuditor r = new RobotHazardAuditor();
		
		System.out.println("Enter Arm Precision (0.0-1.0):");
		double armPrecision = sc.nextDouble();
		
		System.out.println("Enter Work Density (1-20):");
		int workDensity = sc.nextInt();
		
		System.out.println("Enter Machinery State (Worn/Critical/Faulty):");
		String machineState = sc.next();
		
		try {
		double hazardRisk = r.calculateHazardRisk(armPrecision, workDensity, machineState);
		System.out.println("Robot Hazard Risk Score: " + hazardRisk);
		}catch(RobotSafetyException e) {
			System.out.println(e);
		}
		
		sc.close();
	}
}
