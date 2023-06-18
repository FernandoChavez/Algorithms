package com.fuerzadon.compareString;

public class Util {
	public static String compare(StringCompare o1) {
		
		int sum = o1.getFirst().length() + o1.getSecond().length();
		if(sum >10)
			return null;
		
		return o1.getSecond();
	}
}
