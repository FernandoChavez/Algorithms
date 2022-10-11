package com.fuerzadon.oddRepeat;

import java.util.ArrayList;

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
			int position = alphabet.indexOf(letters[i]) +1;
			if(position %2 != 0) 
				arraLettersOddPosition.add(letters[i]);
		}
		
		return arraLettersOddPosition;
	}
}
