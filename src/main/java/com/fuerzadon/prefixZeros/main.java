package com.fuerzadon.prefixZeros;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,0,0,0,2,3,0,1,5,0,3);
		int[] array = {0,0,0,0,2,3,0,1,5,0,3};
		
		System.out.println("List ordenado: "+methods.putZerosBeginningWithList(list));
		System.out.println("Array ordenado: "+methods.putZerosBeginningWithArray(array));

	}

}
