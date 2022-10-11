package com.fuerzadon.bubblesort;

public class Bubblesort {
	
	int arrayNumber[];
	
	public Bubblesort(int arrayNumber[]) {
		this.arrayNumber = arrayNumber;
	}
	
	public int[] addBubblesort() {
		int size = arrayNumber.length, max;
		
		for(int i=0; i<size; i++) {
			for(int j = 0; j<size-1-i; j++) {
				if(arrayNumber[j] > arrayNumber[j+1]) {
					max = arrayNumber[j];
					arrayNumber[j] = arrayNumber[j+1];
					arrayNumber[j+1] = max;
				}
			}
		}
		return arrayNumber;
	}
}
