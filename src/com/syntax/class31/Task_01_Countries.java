package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task_01_Countries {
	
	public static void main(String[] args) {
		
		Set<String> countries = new TreeSet<>();
		countries.add("Belarus");
		countries.add("USA");
		countries.add("Russia");
		countries.add("Albania");
		countries.add("Ukraine");
		
		for(String country:countries) {
			System.out.println(country);
		}
		
		System.out.println("---Using iterator---");
		Iterator<String> it = countries.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
