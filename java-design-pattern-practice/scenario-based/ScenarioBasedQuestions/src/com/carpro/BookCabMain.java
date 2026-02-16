package com.carpro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookCabMain {
	private Map<String, LocalDate> bookingMap;
	
	
	public BookCabMain(Map<String, LocalDate> bookingMap) {
		this.bookingMap = bookingMap;
	}

	public List<String> findCabBookingIdsForTheBookingDate(LocalDate date){
		List<String> res = new ArrayList<>();
		for(String key: bookingMap.keySet()) {
			if(bookingMap.get(key).equals(date)) {
				res.add(key);
			}
		}
		return res;
	}

	public Map<String, LocalDate> getBookingMap() {
		return bookingMap;
	}

	public void setBookingMap(Map<String, LocalDate> bookingMap) {
		this.bookingMap = bookingMap;
	}
	
	
}
