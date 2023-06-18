package com.fuerzadon.anagram;

public class methods {

	public static boolean isAnagram(String word1, String word2) {
		char chars[] = word1.toCharArray();
		
		
		if(word1.length() != word2.length()) {
			return false;
		}
		
		for(char ch : chars) {
			if(word2.contains(ch+"")) {
				word2 = word2.replaceFirst(ch+"", "");
			}
		}
		
		return (word2.length()==0 ? true : false); 
		
	}
	
}
