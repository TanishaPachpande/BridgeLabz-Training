package com.oceanfleet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VesselUtil {
	private List<Vessel> vesselList;

	public VesselUtil() {
	    vesselList = new ArrayList<>();
	}
	
	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel v: vesselList) {
			if(v.vesselId.equals(vesselId)) {
				return v;
			}
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> highSpeeds = new ArrayList<>();

	    if (vesselList.isEmpty()) {
	        return highSpeeds;
	    }

	    double highest = vesselList.get(0).averageSpeed;

	    for (Vessel v : vesselList) {
	        if (v.averageSpeed > highest) {
	            highest = v.averageSpeed;
	        }
	    }

	    for (Vessel v : vesselList) {
	        if (v.averageSpeed == highest) {
	            highSpeeds.add(v);
	        }
	    }

	    return highSpeeds;
	}
}
