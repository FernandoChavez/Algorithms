package com.fuerzadon.bubblesort;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.Test;



public class BubblesortTest {

	/*
	 int arrayNumbers[] = {55, 11, 3, -11, 2, 18, 21, 13, -3};
	
	@Test
    public void bubbleSortIsAdded() {
		int outputExpected[]= {-11, -3, 2, 3, 11, 13, 18, 21, 55};
        BubbleSort bubbleSort = new BubbleSort(arrayNumbers);
        int outputReceived[] = bubbleSort.addBubbleSort();
        assertArrayEquals(outputExpected, outputReceived);
    }
	
	@Test
    public void bubbleSortIsNotAdded() {
		int outputExpected[]= {-11, -3, 2, 3, 11, 13, 18, 21, 55};
        BubbleSort bubbleSort = new BubbleSort(arrayNumbers);
        int outputReceived[] = bubbleSort.addBubbleSort();
        //assertThat(outputExpected, is(not(outputReceived)));
    }
	
	@Test(expected=NullPointerException.class)
	public void bubbleSortIsNull() {
		int arrayNumbers[] = null;
		BubbleSort bubbleSort = new BubbleSort(arrayNumbers);
		bubbleSort.addBubbleSort();		
	} 
	  
	 */
	
	int arrays[] = {55, 11, 3, -11, 2, 18, 21, 13, -3};
	
	@Test
	public void bubbleSortAdded() {
		int outputExpected[] = {-11, -3, 2, 3, 11, 13, 18, 21, 55};
		Bubblesort bubblesort = new Bubblesort(arrays);
		int outputReceived[] = bubblesort.addBubblesort();
		assertArrayEquals(outputExpected, outputReceived);
	}
	
	

}
