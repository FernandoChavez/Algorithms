package com.fuerzadon.cardinalPointsPath;
import java.util.List;

public class methods {
	public static boolean getReturnOrigin(List<Character> list) {
		
		int[] counts = {0,0,0,0};
		char [] cp = {'n', 's', 'e', 'w'};
		
		for(int x = 0; x<counts.length; x++) {
			final int finalValue =x;
			counts[x] = (int) list.stream().
					filter(i -> i==cp[finalValue])
					.count();
		}
		
		return (counts[0] == counts[1] && counts[2] == counts[3] ? true : false);
	}
	
}