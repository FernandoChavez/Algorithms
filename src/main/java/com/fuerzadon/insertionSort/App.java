package com.fuerzadon.insertionSort;

import java.util.Arrays;

import com.fuerzadon.bubblesort.Bubblesort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayNumbers[] = {55, 11, 3, -11, 2, 18, 21, 13, -3};
		
		InsertionSort obj = new InsertionSort(arrayNumbers);
    	System.out.println("Not sorting: "+Arrays.toString(arrayNumbers));
    	int arrayInsertionSort[] = obj.addSort();
    	int arrayInsertionSort2[] = obj.addSort2();
    	System.out.println("Sorting: "+ Arrays.toString(arrayInsertionSort));
    	System.out.println("Sorting2: "+ Arrays.toString(arrayInsertionSort2));
	}

}
