package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Doctor{
	String name;
	String speciality;
	boolean availability;
	
	public Doctor(String name, String speciality, boolean availability) {
		this.name = name;
		this.speciality = speciality;
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" | Speciality: "+speciality+" | Availability: "+availability;
	}
}
public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> doctors = new ArrayList<>();
		
		doctors.add(new Doctor("doctor1", "heart specialist", true));
		doctors.add(new Doctor("doctor2", "skin specialist", false));
		doctors.add(new Doctor("doctor3", "eye specialist", true));
		doctors.add(new Doctor("doctor4", "bone specialist", false));
		doctors.add(new Doctor("doctor5", "ear specialist", true));
		
		List<Doctor> availableDoctors = doctors.stream()
				.filter(d -> d.availability==true)
				.sorted(
						Comparator.comparing((d)-> d.speciality) 
						)
				.toList();
		
		availableDoctors.forEach(System.out::println);
	}
}
