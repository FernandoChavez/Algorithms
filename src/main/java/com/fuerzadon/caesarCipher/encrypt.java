package com.fuerzadon.caesarCipher;

public class encrypt {
	
	public static String caesarCiphel(String message, int k) {
		String alphabet, cryp="";	
		char letter;
		int pos, newPos;
		
		for(int x = 0; x<message.length(); x++) {
			letter=message.charAt(x);
			if(Character.isLowerCase(letter))
				alphabet = "abcdefghijklmnopqrstuvwxyz";
			else
				alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			if(alphabet.indexOf(letter)!=-1){
				pos=alphabet.indexOf(letter);
				newPos=(pos+k)%alphabet.length();	
				letter=alphabet.charAt(newPos);
			}
			cryp+=letter+"";
		}
		
		return cryp;
	}
	
	
	
}
