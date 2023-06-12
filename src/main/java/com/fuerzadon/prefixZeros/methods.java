package com.fuerzadon.prefixZeros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class methods {

	public static List<Integer> putZerosBeginningWithList(List<Integer> list){
		List<Integer> listZeros = new ArrayList<>();
		List<Integer> listNumbers = new ArrayList<>();
		List<Integer> myList = new ArrayList<>();
		
		listZeros = list.stream()
				.filter(n -> n==0)
				.collect(Collectors.toList());
		
		listNumbers = list.stream()
				.filter(n -> n!=0)
				.collect(Collectors.toList());
		
		myList.addAll(listZeros);
		myList.addAll(listNumbers);
		
		return myList;
	}
	
	
	public static List<Integer> putZerosBeginningWithArray(int [] array){
		List<Integer> listZeros = new ArrayList<>();
		List<Integer> listNumbers = new ArrayList<>();
		List<Integer> myList = new ArrayList<>();
		
		for(int n : array) {
			if(n==0)
				listZeros.add(n);
			else
				listNumbers.add(n);
		}
		
		myList.addAll(listZeros);
		myList.addAll(listNumbers);
		
		return myList;
	}
}
