package com.fuerzadon.atm;

public class methods {
	public static int[] getBills(int cash) {
		int[] bills = {500,200,100,50};
		int[] amountBills = {0, 0, 0, 0};
		
		for(int i=0; i<bills.length; i++) {
			if(cash>=bills[i]) {
				amountBills[i] =cash/bills[i];
				cash=cash%bills[i];
			}
		}
		
		return  amountBills;
	}
}