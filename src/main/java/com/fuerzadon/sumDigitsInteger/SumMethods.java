package com.fuerzadon.sumDigitsInteger;

public class SumMethods {

	
	
	int num;

	public SumMethods(int num) {
		super();
		this.num = num;
	}
	
	public int sumDigits() {
		
		System.out.println(num + ", " + num%10);
		int sum = 0;
		int division = num/10;
		while(division > 0) {
			System.out.println(division + ", " + division%10);
			sum += (division%10);
			division /=10;
		}
		sum +=(num%10);
		System.out.println(sum);
		return sum;
	}
}
