package com.streamapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Member{
	String name;
	LocalDate expiryDate;
	
	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
}

public class FilteringExpiringMemberships {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		
		members.add(new Member("abc", LocalDate.of(2026, 2, 5)));
		members.add(new Member("def", LocalDate.of(2026, 4, 30)));
		members.add(new Member("ghi", LocalDate.of(2026, 5, 10)));
		members.add(new Member("jkl", LocalDate.of(2026, 3, 1)));
		members.add(new Member("mno", LocalDate.of(2026, 2, 17)));
		
		Predicate<Member> checkExpiry = (member) -> {
			LocalDate today = LocalDate.now();
            LocalDate next30Days = today.plusDays(30);

            return member.expiryDate.isAfter(today.minusDays(1))
                    && member.expiryDate.isBefore(next30Days.plusDays(1));
		};
		
		List<Member> nearExpiry = members.stream().filter(checkExpiry).toList();
		
		System.out.println(nearExpiry);
		
	}
}
