package com.fuerzadon.primeNumer;

public class PrimeNumbers {
		
	int number;

	public PrimeNumbers(int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		
		if(number <=1) {
			return false;
		}
		
		for(int x = 2; x*x <=number; x++) {
			if(number%x == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	public boolean isPrime() {
		if(number <2)
			return false;
		else
			for(int i = 2; i<number; i++) 
				if((number%i) == 0)
					return false;
			
		return true;
	}
	*/
	
	
	
	
}
