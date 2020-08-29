package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task_02_Cities {
	
	public static void main(String[] args) {
		
		Set <String> cities = new LinkedHashSet<>();
		
		cities.add("Minsk");
		cities.add("New York");
		cities.add("Kyev");
		cities.add("Moscow");
		cities.add("Tirana");
		cities.add("Anapa");
		
		 Iterator <String> it = cities.iterator();
		 
		while(it.hasNext()) {
			String city = it.next();
			if(city.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(cities);
		
		
	}

}
