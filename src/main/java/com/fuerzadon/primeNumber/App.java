package com.fuerzadon.primeNumber;

import java.util.List;

public class App 
{
    public static void main( String[] args ){
    	int num = 4;
    	List<Integer> primeNumbers = List.of(1,4,7,12,5,8,17,456,2371);
    	PrimeNumbers number = new PrimeNumbers(num);
    	System.out.println(num +" es primo? "+number.isPrime());
    	
    	System.out.println("Metodo static: Es "+num+ " un numero primo?: "+ PrimeNumbersStatic.isPrime(num));
    	System.out.println("Hay "+PrimeNumbersStatic.numberPrimes(primeNumbers)+" numeros primos en la lista");
    	
    }
}
