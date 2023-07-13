package com.fuerzadon.codeSafe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We have a safe that have custom alphabet for the key or code (min 10 characters) and a custom amount of digits or characters (between 4 and 6) 
		//in the moment to purchase it. Create a method that receive the alphabet and the amount of digits and return the permutation.
		String alphabet = "1234567890";
		int dig = 5;
		
		System.out.println("La permutacion es de: "+methods.getPermutation(alphabet, dig));
	}

}
