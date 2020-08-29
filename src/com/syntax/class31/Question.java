package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question {
	
	public static void main(String[] args) {
		
		// How can you remove all duplicates from ArrayList?
		
		List <String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jane");
		
		Set <String> set = new LinkedHashSet<>();
		
		set.addAll(aList);
		
		System.out.println(set);
		
		// how to get one specific element? --> convert it to ArrayList
		Set<String> countries = new LinkedHashSet<>();
		countries.add("Belarus");
		countries.add("USA");
		countries.add("Russia");
		countries.add("Albania");
		countries.add("Ukraine");
		
		List<String> list = new ArrayList<>(countries);
		String country = list.get(0);
		System.out.println(country);
		
	}

}
