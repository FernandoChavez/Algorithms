package com.fuerzadon.reverseWord;

public class methods {

	public static String reverseString(String word) {
		char chs[] = word.toCharArray(), ch1;
		int size = chs.length/2;
		
		for(int x=0; x<size; x++) {
			ch1 = chs[word.length()-1-x];
			chs[word.length()-1-x] = chs[x];
			chs[x] = ch1;
		}
		
		return new String(chs);
	}
}
