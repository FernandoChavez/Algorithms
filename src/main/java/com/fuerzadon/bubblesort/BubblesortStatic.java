package com.fuerzadon.bubblesort;

import java.util.List;

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
	
	
	static List<Integer> addBubbleSortList(List<Integer> list){
		int size = list.size(), max;
		
		for(int x=0; x<size; x++) {
			for(int i=0; i<size-1-x; i++) {
				if(list.get(i)>list.get(i+1)) {
					max=list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, max);
				}
			}
		}
		
		return list;
	}
	

}
