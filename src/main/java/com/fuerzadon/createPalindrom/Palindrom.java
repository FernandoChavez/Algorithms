package com.fuerzadon.createPalindrom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;



public class Palindrom {
	
	static String createPalindrom(int N, int K) {
		
		/// write your code in Java SE 8
		String letters = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		char randomChar;
		String stringRandomChar;
		List<Character> list = new ArrayList<>();
		Stack <Character> stack = new Stack<Character>();
        
        int halfNSize;
        boolean odd = false;
        String  word = "";
        
        if((N%2)==0) {
            halfNSize = N/2;
        }
        else {
        	halfNSize = (N-1)/2;
        	odd=true;
        }
              
        // add letter to letters' dictionary
        for(int j = 0; j < K; j++) {
        	randomChar = letters.charAt(rnd.nextInt(letters.length()));
        	stringRandomChar = ""+randomChar;
        	letters = letters.replace(stringRandomChar, "");   	
        	list.add(randomChar);
        }
        
        //fill first half
        for(int i = 0; i < halfNSize; i++){
        	randomChar = list.get(rnd.nextInt(list.size()));        	
        	stack.push(randomChar);
        	word=word+randomChar;
        }
        
        if(odd==true) 
        	word=word+list.get(rnd.nextInt(list.size()));
        
      //fill second half
        for(int i = 0; i < halfNSize; i++){
        	word=word+stack.pop();
        }
        
        return word;
	}
}
