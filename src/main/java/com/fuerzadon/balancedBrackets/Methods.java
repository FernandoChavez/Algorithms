package com.fuerzadon.balancedBrackets;

public class Methods {
	
	static boolean isBalanced(String str) {
		if(str == null || ((str.length() % 2) != 0)) {
			return false;	
		}else {
			char[] ch = str.toCharArray();
			for(char c : ch) {
				if(!(c== '{' || c == '[' || c == '(' || c== '}' || c == ']' || c == ')')) {
					return false;
				}
			}
		}	
		return true;
	}
	
	
	static boolean isBalancedReplaceAllMethod(String str) {
		while(str.contains("()") || str.contains("[]") || str.contains("{}")) {
			str = str.replaceAll("\\(\\)", "")
					.replaceAll("\\[\\]", "")
					.replaceAll("\\{\\}", "");
		}
		return(str.length() == 0);
	
	}
	
	static boolean stackMethod(String Str) {
		
	
		
		return false;
	}
	
	
}
