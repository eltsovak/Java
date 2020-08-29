package com.syntax.class29;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		// before java 1.5 collections were non Generic
		// non Generic = not preferable
		names.add("Ksenia");
		names.add("Olga");
		names.add("Michael");
		names.add("Ely");
		names.add("Julia");
		
		Boolean isEmpty = names.isEmpty();
		System.out.println("Array is empty = " + isEmpty);
		
		Boolean specificName = names.contains("Ksenia");
		System.out.println("Array contains specific name = " + specificName);
		
		System.out.println("The size of the array is " + names.size());
		System.out.println(names);
		
		names.clear();
		
		System.out.println("Array after clear " + names);
	}

}
