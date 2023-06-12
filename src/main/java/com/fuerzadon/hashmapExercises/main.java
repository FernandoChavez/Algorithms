package com.fuerzadon.hashmapExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("England", "London");
		map.put("Germany", "Berlin");
		map.put("Norway", "Oslo");
		map.put("USA", "Washington DC");
		map.put("Mexico", "CDMX");
		map.put("Japan", "Tokio");
		map.put("Argentina", "Buenos Aires");
		
		String country = "Mexico";
		System.out.println("La capital de "+country+ " es: "+methods.existCountry(map, country));
	}

}
