package com.fuerzadon.insertionSort;

public class InsertionSort {

	int array[];
	
	public InsertionSort(int array[]) {
		this.array = array;
	}
	
	
	public int[] addSort() {
		// Comenzamos desde el segundo elemento ( índice 1 )    
		for(int i=1; i < array.length; i++) {
			// Obtenemos el elemento pivote que vamos a insertar
			int element = array[i];
			int j = i;
			// Verificamos si aún no estamos en la posición que le corresponde al elemento
			for (; j>= 1 && array[j-1]>element; j--) {
				array[j] = array[j-1];
			}
			// Colocamos al pivote en su posición correspondiente
			array[j]= element;
		}
		return array;
	}
	
	public int[] addSort2() {
		 int temp = 0;
	     for (int i = 1; i < array.length; i++) {
	         temp = array[i];
	         int j = 0;
	         for (j = i - 1; j >= 0; j--) {
	             if (array[j] > temp) {
	                 array[j + 1] = array[j];
	             } else {
	                 break;
	             }
	         }
	         array[j + 1] = temp;
	     }
	     return array;
	}
}
