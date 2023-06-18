package com.fuerzadon.balancedBrackets;

import java.util.Stack;

public class Methods {
	
	static boolean isBalanced(String str) {
		
		if(str.length()%2 != 0){
            return false;
        }
		
		Stack<Character> stack = new Stack<>();
		char[] chars = str.toCharArray();
		String prefix = "{([", surfix = "})]";
		
		
		for(char ch : chars) {
			if(prefix.contains(ch +"")){
				stack.push(ch);
			}else {
				
				for(int i = 0; i<surfix.length(); i++) {
					if(ch == surfix.charAt(i)) {
						if(stack.size() ==0 || stack.peek() != prefix.charAt(i)) {
							return false;
						}
						stack.pop();
					}
					
				}
			}
		}
		
		return (stack.size() == 0 ? true : false);
	}
	
	
	
	
	
}
