package com.fuerzadon.palindrome;

public class Palindrome {	
	
	String phrase;
	
	public Palindrome(String phrase) {
		this.phrase=phrase;
	}
	
	public boolean isPalindrome() {				
		phrase= phrase.replace(" ", "").toLowerCase();
		int sizePhrase =phrase.length();
		int halfSize=sizePhrase/2;
		
		for(int i=0; i<halfSize;i++) {
			if(phrase.charAt(i) != phrase.charAt(sizePhrase-i-1)){
				return false;
			}
		}
		
		return true;
		
	}
	
}
