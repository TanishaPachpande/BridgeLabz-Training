package com.functionalinterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface FormatDates{
	static String formatting(LocalDate date, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
	}
}
public class DateFormatUtility {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2026, 2, 2);
		
		String format1 = FormatDates.formatting(date, "dd-MM-yyyy");
		String format2 = FormatDates.formatting(date, "MM-dd-yyyy");
		String format3 = FormatDates.formatting(date, "dd-MMM-yyyy");
		
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(format3);
	}
}
