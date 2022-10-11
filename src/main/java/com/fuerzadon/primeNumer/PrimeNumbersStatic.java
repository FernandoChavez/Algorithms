package com.fuerzadon.primeNumer;

public class PrimeNumbersStatic {
	
	/*
	static boolean isPrime(int num) {
		if(num<2)
			return false;
		else
			for(int i = 2; i<num; i++) {
				if((num%2) == 0)
					return false;
			}
		
		return true;
	}
	*/
	
	static boolean isPrime(int num) {
		for(int x=2; x*x <=num; x++) {
			if(num%x==0)
				return false;	
		}
		return true;
			
	}
	
	
	
	
	
}
