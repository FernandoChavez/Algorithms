package com.fuerzadon.cardinalPointsPath;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a methods where receive a array woth 10 char values, each one represent a cardinal point and a steps where a person must walk.
		//Return true if the person return to the original position after to walt the 10 steps and false if he doesn't
		
		List<Character> list = Arrays.asList('n', 's', 's', 'w', 'e', 'n', 'n', 's', 'e', 'w');
		
		List<Character> list2 = Arrays.asList('n', 's', 's', 'w', 'e', 'n', 'n', 'w', 'w', 'w');
		
		System.out.println("Resultado: "+methods.getReturnOrigin(list));
		System.out.println("Resultado: "+methods.getReturnOrigin(list2));
		

	}

}
