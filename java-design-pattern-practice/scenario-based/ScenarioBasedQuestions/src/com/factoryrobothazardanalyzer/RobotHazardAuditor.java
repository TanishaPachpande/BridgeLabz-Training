package com.factoryrobothazardanalyzer;

import java.util.HashMap;
import java.util.Map;

public class RobotHazardAuditor {
	

	public double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
		
		String[] states = {"Worn","Faulty","Critical"};
		
		if(!(armPrecision>=0.0 && armPrecision<=1.0)) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		
		if(!(workerDensity>=1 && workerDensity<=20)) {
			throw new RobotSafetyException("Error: Work density must be 1-20");
		}
		
		boolean found=false;
		for(String s: states) {
			if(s.equals(machineryState)) {
				found=true;
				break;
			}
		}
		
		if(!found) {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		
		Map<String, Double> riskFactors = new HashMap<>();
		riskFactors.put("Worn", 1.3);
		riskFactors.put("Faulty", 2.0);
		riskFactors.put("Critical", 3.0);
		
		double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * riskFactors.get(machineryState));
		return hazardRisk;
	}
}
