package com.fuerzadon.bubblesort;

public class BubblesortStatic {
	
	static int[] addBubblesort(int array[]) {
		int size = array.length, max;
		
		for(int i = 0; i< size; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(array[j]>array[j+1]) {
					max= array[j];
					array[j] = array[j+1];
					array[j+1] = max;
				}
			}
		}
		
		return array;
		
		
	}

}
