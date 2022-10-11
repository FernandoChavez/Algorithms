package com.fuerzadon.palindrome;

public class PalindromeStatic {
	
	static boolean isPalindrome(String phrase) {
		phrase = phrase.replace(" ", "").toLowerCase();
		int size= phrase.length();
		int half=size/2;
		
		for(int i=0; i<half; i++) {
			if(phrase.charAt(i) != phrase.charAt(size-i-1))
				return false;
		}
		
		return true;
	}
	
}
