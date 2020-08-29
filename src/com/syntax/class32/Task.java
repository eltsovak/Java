package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();
		countries.put("Belarus", "Minsk");
		countries.put("USA", "Washington DC");
		countries.put("Russia", "Moscow");
		countries.put("Ukraine", "Kyiv");
		countries.put("France", "Paris");

		Set <String> country = countries.keySet();

		Iterator<String> countriesIt = country.iterator();

		while (countriesIt.hasNext()) {
			String oneC = countriesIt.next();
			System.out.println(oneC + " = " + countries.get(oneC));
		}

		for (String one : country) {
			System.out.println(one + " - " + countries.get(one));
		}
	
	}

}
