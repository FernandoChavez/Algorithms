package com.fuerzadon.wordsCount;

public class Sentences {
	static int getMaxWords(String sentence) {
		int maxWords=0;
		String []  arraySentences = sentence.split("(\\.|\\?|!)");
		
		for(String i : arraySentences) {
			String[] words = i.trim().split("\\s+");
			if(words.length>maxWords)
				maxWords=words.length;
		}
		
		return maxWords;
	}
}
