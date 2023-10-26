package com.fuerzadon.primeNumber;

import java.util.List;

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
	
	static int numberPrimes(List<Integer> list) {	
		return (int) list.stream()
			.filter(i -> isPrime(i))
			.count();
	}
	
	static boolean isPrime(int num) {
		
		if(num<2){
			return false;
		}
		
		for(int x=2; x*x <=num; x++) {
			if(num%x==0)
				return false;	
		}
		
		return true;
		//return (num >1 ? true : false);	
	}
	
	
	
	
	
	
	
}
