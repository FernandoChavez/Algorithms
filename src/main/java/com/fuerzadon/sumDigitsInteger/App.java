package com.fuerzadon.sumDigitsInteger;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 328374;
		
		SumMethods sum = new SumMethods(numero);
		System.out.println("La suma de los digitos del numero "+ sum.sumDigits());

	}

}
