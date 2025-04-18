package com.fuerzadon.oddRepeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Odd {

	static ArrayList<Character> oddNumRepeat(char letters []) {
		//[f,s,a,n,e,j,w,j,t,s,s,n] Out: [f,a,e,w,t,s] 
		ArrayList<Character> arrayOddLetters = new ArrayList<Character>();		

		for(int i = 0; i< letters.length; i++) {
			if((i+1)%2 != 0)
				arrayOddLetters.add(letters[i]);
		}
		return arrayOddLetters;
	}
	
	
	static ArrayList<Character> getLettersOddPosition (char letters[])
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		//[f,s,a,n,e,j,w,j,t,s,s,n] Out: [s, a, e, w, s, s] 
		ArrayList<Character> arraLettersOddPosition = new ArrayList<Character>();
		
		for(int i = 0; i< letters.length; i++) {
			if(getPositionAlphabet(letters[i], alphabet) %2 != 0) 
				arraLettersOddPosition.add(letters[i]);
		}
		
		return arraLettersOddPosition;
	}
	
	
	public static List<Character> getLettersOddPositionStreams(char letters[]){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Stream<Character> stream = new String(letters).chars().mapToObj(c ->(char)c);
		
		//[f,s,a,n,e,j,w,j,t,s,s,n] Out: [s, a, e, w, s, s] 
		return stream
				.filter(i -> getPositionAlphabet(i, alphabet)%2 != 0)
				.collect(Collectors.toList());
	}
	
	
	public static int getPositionAlphabet(char letter, String alphabet) {
		return alphabet.indexOf(letter + 1);
	}
}
