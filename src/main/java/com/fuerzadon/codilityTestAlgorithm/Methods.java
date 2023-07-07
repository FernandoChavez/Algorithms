package com.fuerzadon.codilityTestAlgorithm;
import java.util.Arrays;

class Methods {
	
    public static int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        //1, 1, 2, 3, 4, 6

        int size = A.length;

        for(int x=0; x<size-1; x++){
            if(A[x]>0){
                if((A[x]+1 != A[x+1]) && (A[x] < A[x+1])){
                    return A[x]+1;
                }
            }     
        }
        
        return(A[size-1]<1 ? 1 : A[size-1]+1);

    }
}
