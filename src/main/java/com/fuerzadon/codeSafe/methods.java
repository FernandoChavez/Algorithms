package com.fuerzadon.codeSafe;

public class methods {
	
	public static int getPermutation(String alphabet, int group) {
		
		int numberChar = alphabet.length(), dividendoFactorial = 1, divisor = numberChar-group , divisorFactorial = 1;
		
		//apply permutation form (factorial numbers)
		//form Vnk = (n! / (n - k)!)
		
		for(int i = 1; i<=numberChar; i++) 
			dividendoFactorial*=i;
		
		for(int j = 1; j <= divisor; j++)
			divisorFactorial *= j;
		
		return dividendoFactorial / divisorFactorial;
	}
}
