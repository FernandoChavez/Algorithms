package com.fuerzadon.compareString;

import com.fuerzadon.compareString.StringCompare;
import com.fuerzadon.compareString.Util;

public class main {

	//Coompare 2 Strings. Si la suma de carateres de los 2 strings son mas de 10, retorna un null, si no, imprime el String 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompare o1 = new StringCompare("texto1", "texto2");
		StringCompare o2 = new StringCompare("test", "hi");
		StringCompare o3 = new StringCompare("Hola", "todos");
		
		System.out.println(Util.compare(o1));
		System.out.println(Util.compare(o2));
	}

}
