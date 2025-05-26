package com.fuerzadon.palindrome;

public class RecursivePalindrome {

	static boolean isPalindrome(String word) {
		
		word = word.replace(" ", "").toLowerCase();
		return isPalindrimeRecursive(word, 0, word.length()-1);
		
		
	}
	
	
	static boolean isPalindrimeRecursive(String word, int left, int right) {
		
		if(left>=right){
			return true;
		}
		
		if(word.charAt(left) != word.charAt(right)) {
			return false;
		}
		
		return isPalindrimeRecursive(word, left+1, right-1);
	}
}
