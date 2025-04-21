package minMax;

import java.lang.reflect.Array;

public class methods {
	public static int[] getminMax(int [] arrayNumbers){
		
		if(arrayNumbers == null || arrayNumbers.length==0) {
			throw new IllegalArgumentException("El arreglo no puede ser nulo");
		}
		
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : arrayNumbers ){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return new int[] {min, max};
    }
	
	
	public static int[] getminMax2(int [] arrayNumbers) {
		
		if(arrayNumbers == null || arrayNumbers.length==0) {
			throw new IllegalArgumentException("El arreglo no puede ser nulo");
		}
			
			
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;	
		for(int i : arrayNumbers) {
			if(i<min)
				min=i;
			if(i>max)
				max=i;
			
		}	
		return new int[] {min,max};
	}
}
