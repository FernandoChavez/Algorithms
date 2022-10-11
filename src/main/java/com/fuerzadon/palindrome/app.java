package com.fuerzadon.palindrome;

public class app {

	public static void main(String[] args) {
		String phrase = "aNita LaVa la tINa";
		
		Palindrome phr1 = new Palindrome(phrase);
		System.out.println(phrase + " is palindrome? "+ phr1.isPalindrome());
		System.out.println(phrase + "Static way. "+phrase + " is palindrome?: "+ PalindromeStatic.isPalindrome(phrase));
	}

}
