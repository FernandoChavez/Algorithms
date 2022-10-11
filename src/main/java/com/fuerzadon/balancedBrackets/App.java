package com.fuerzadon.balancedBrackets;

import java.util.Stack;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack pila = new Stack();
		Methods Methods = new Methods();
		String a = "(){}[]", b = "({[]})", c= "(((){}[]){(){}[]}[(){}[]])",  d= "((((((((((((" , e = ")(){}[]", f = "[][]{}{}{[)]}" ;
		
		System.out.println(a+ " is balanced?: " + Methods.isBalanced(a));
		System.out.println(b+ " is balanced?: " + Methods.isBalanced(b));
		System.out.println(c+ " is balanced?: " + Methods.isBalanced(c));
		System.out.println(d+ " is balanced?: " + Methods.isBalanced(d));
		System.out.println(e+ " is balanced?: " + Methods.isBalanced(e));
		System.out.println(f+ " is balanced?: " + Methods.isBalanced(f));
		
		System.out.println();
		System.out.println();
		
		System.out.println(a+ " is balanced with ReplaceAllMethods?: " + Methods.isBalancedReplaceAllMethod(a));
		System.out.println(b+ " is balanced with ReplaceAllMethods?: " + Methods.isBalancedReplaceAllMethod(b));
		System.out.println(c+ " is balanced with ReplaceAllMethods?: " + Methods.isBalancedReplaceAllMethod(c));
		System.out.println(d+ " is balanced with ReplaceAllMethods?: " + Methods.isBalancedReplaceAllMethod(d));
		System.out.println(e+ " is balanced with ReplaceAllMethods?: " + Methods.isBalancedReplaceAllMethod(e));
		System.out.println(f+ " is balanced with ReplaceAllMethods?: " + Methods.isBalancedReplaceAllMethod(f));
		
	}
	
	

}
