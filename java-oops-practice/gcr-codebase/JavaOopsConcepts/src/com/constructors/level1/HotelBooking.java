package com.constructors.level1;

public class HotelBooking {

	// Attributes
	String guestName;
	String roomType;
	int nights;
	
	// Default constructor
	HotelBooking(){
		guestName="Unknown";
		roomType="Unknown";
		nights=0;
	}
	
	// Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
    
    // Copy constructor
    HotelBooking(HotelBooking hb) {
    	this.guestName=hb.guestName;
		this.roomType=hb.roomType;
		this.nights=hb.nights;
    }
    
    // Method to display book details
    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    
	public static void main(String[] args) {
		HotelBooking a = new HotelBooking();
		a.displayBookingDetails();
		HotelBooking b = new HotelBooking("Ashish","AC",8);
		b.displayBookingDetails();
		HotelBooking c = new HotelBooking(b);
		c.displayBookingDetails();
	}
}
