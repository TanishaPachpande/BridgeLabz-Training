package com.junit.junit_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.junit_practice.StringUtils;

class StringUtilsTest {
	StringUtils s;
	
	@BeforeEach
	void setup() {
		s = new StringUtils();
	}
	
	@Test
	void testReverse() {
		assertEquals("olleh", s.reverse("hello"));
	}
	
	@Test
	void testisPalindromeTrue() {
		assertTrue(s.isPalindrome("anna"));
	}
	
	@Test
	void testisPalindromeFalse() {
		assertFalse(s.isPalindrome("anii"));
	}
	
	@Test
	void testToUppercase() {
		assertEquals("HELLO", s.convertToUpperCase("hello"));
	}
	
	@Test
	void testNull() {
		assertNull(s.reverse(""));
	}

}
