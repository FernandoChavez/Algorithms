package com.fuerzadon.paypalExercises;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class app1 {

	public static void main(String[] args) {
		//We have a String name = “alphabet”.
		//Write a Lambda exp to count occurrence of character ‘a’ in the above string.

		/*
		
		class MyCode {
			public static void main (String[] args) {
		    Set<char> letters = new HashSet<char>;
		    String word = "elephant", repeated;
		    for(int x = 0; x < word.length(); x++ ){
		      letters.add(word.charAt(x));
		      
		    }
		      
		  
			}
			*/
		/*
		List<Character> list = new ArrayList<>();	
		
		for(char ch : word.toCharArray()) {
			list.add(ch);
		}*/
		String word = "elphebet";
		
		List<Character> list = new ArrayList<>();
		
		for(char ch : word.toCharArray()) {
			list.add(ch);	
		}
		
		int count = (int) list.stream()
				.filter(i -> i=='e')
				.count();
		System.out.println(count);	
	
	}
}
