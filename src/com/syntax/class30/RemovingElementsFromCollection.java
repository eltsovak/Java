package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {
	
	public static void main(String[] args) {
		
		//create an arraylist of city names
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York");
		
		System.out.println("Original arrayList === " + cities);
		// remove cities LA, DC
		
		for(int i = 0; i < cities.size(); i++) {
			if(cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
			}
		}
		System.out.println("Final ArrayList === " + cities);
		
		System.out.println("---Removing Objects from ArrayList using enhanced loop ---");
		
//		for(String city:cities) {
//			if(city.equals("LA")) {
//				cities.remove(city); // don't use enhanced for loop, there will be an exception
//				
//			}
//		}
		System.out.println(cities);
		
		System.out.println("---Removing Objects from ArrayList using iterator ---");
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");
		
		System.out.println(cities);
		
		Iterator<String> citiesIT = cities.iterator();
		// let's remove New York and LA Objects
		
		while(citiesIT.hasNext()) {
			String ci = citiesIT.next();
			if(ci.equals("LA") || ci.equals("New York")) {
				citiesIT.remove();
			}
		}
		
		System.out.println("ArrayList after modifications from Iterator: " + cities);
		
	}

}
