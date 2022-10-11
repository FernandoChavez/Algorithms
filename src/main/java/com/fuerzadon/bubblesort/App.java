package com.fuerzadon.bubblesort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayNumbers[] = {55, 11, 3, -11, 2, 18, 21, 13, -3};
		
		
    	
    	Bubblesort obj = new Bubblesort(arrayNumbers);
    	System.out.println("Not sorting: "+Arrays.toString(arrayNumbers));
    	int arrayBubbleSort[] = obj.addBubblesort();
    	System.out.println("Sorting: "+ Arrays.toString(arrayBubbleSort));
    	
    	//Static
    	System.out.println("Static. Sorting: "+Arrays.toString(BubblesortStatic.addBubblesort(arrayNumbers)));
    	
	}

}
