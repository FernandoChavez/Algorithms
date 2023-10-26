package com.fuerzadon.atm;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cash = 4250;
		
		System.out.println("La cantidad de billetes para "+cash+" es:" );
		
		for(int i : methods.getBills(cash)) {
			System.out.println(i);
		}

	}

}
