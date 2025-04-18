package com.fuerzadon.oddRepeat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arrayLetters[] = {'f','s','a','n','e','j','w','j','t','s','s','n'};
		System.out.println(Odd.oddNumRepeat(arrayLetters));
		System.out.println(Odd.getLettersOddPosition(arrayLetters));
		System.out.println(Odd.getLettersOddPositionStreams(arrayLetters));
	}

}
