package com.fuerzadon.anagram;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1="amor", w2 = "roma", w3="lamina", w4="anima";
		System.out.println(w1+" y "+w2+" son anagramas? "+ methods.isAnagram(w1, w2));
		System.out.println(w3+" y "+w4+" son anagramas? "+ methods.isAnagram(w3, w4));
	}

}
