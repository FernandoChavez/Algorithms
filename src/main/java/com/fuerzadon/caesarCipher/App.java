package com.fuerzadon.caesarCipher;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "www.abc.xy";
		String message2 = "tuvwxyz";
		String message3 = "vyw-ABC.abc-XIY";
		System.out.println(encrypt.caesarCiphel(message, 87));
		System.out.println(encrypt.caesarCiphel(message2, 5));
		System.out.println(encrypt.caesarCiphel(message3, 3));

	}

}
