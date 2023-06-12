package com.fuerzadon.primeNumer;

public class App 
{
    public static void main( String[] args ){
    	int num = 25;
    	PrimeNumbers number = new PrimeNumbers(num);
    	System.out.println(num +" es primo? "+number.isPrime());
    	
    	System.out.println("Metodo static: Es "+num+ " un numero primo?: "+ PrimeNumbersStatic.isPrime(num));
    	
    }
}
