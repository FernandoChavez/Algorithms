package com.fuerzadon.sumdigits;

import java.util.ArrayList;
import java.util.List;

public class SumDigitIntenger {
	int num;
	
	public SumDigitIntenger(int num) {
		this.num = num;
	}
	
	public int sumDigitsFirstWay() {
		int sum=0;
		int division = num/10;	
		while(division > 0) {
			System.out.println(division +", "+ division%10);
			sum +=(division%10);
			division /=10;
		}	
		sum +=(num%10);	
		System.out.println(sum);
		return sum;
	}
}
