package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class RetreivingValuesFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Ksenia");
		names.add("Olga");
		names.add("Michael");
		names.add("Ely");
		names.add("Julia");
		
		// how to retrieve a value
		String str = names.get(3);
		System.out.println(str);
		
		// how to retrieve values one by one
		
		System.out.println("---Retreiving values from ArrayList using enhanced for loop---");
		for(String name: names) {
			System.out.println(name);
			if(name.equals("Ksenia")) {
				System.out.println("Ksenia is awesome");
			}
		}
		System.out.println("---Retreiving values from ArrayList using regular for loop---");
		
		for(int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println(s);
		}
		System.out.println("---Retreiving values from ArrayList using for iterator---");
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			String x = it.next();
			System.out.println(x);
		}
		
	}

}
