package com.fuerzadon.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeTest {

	@Test
	public void isPalindrome() {
		Palindrome palindrome = new Palindrome("ana");
		boolean result = palindrome.isPalindrome();
		assertTrue(result);
	}
	
	@Test
	public void isNotPalindrome() {
		Palindrome palindrome = new Palindrome("anaa");
		boolean result = palindrome.isPalindrome();
		assertFalse(result);
	}
	
	@Test(expected=NullPointerException.class)
	public void isNull() {
		Palindrome palindrome = new Palindrome(null);
		boolean result = palindrome.isPalindrome();
	}

}
