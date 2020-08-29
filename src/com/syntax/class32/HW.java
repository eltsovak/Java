package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {
	
	public static void main(String[] args) {
		
		Map <Integer, String> floors = new LinkedHashMap<>();
		floors.put(1, "Aidana & CO.");
		floors.put(2, "Sema & CO.");
		floors.put(3, "Kamila & CO.");
		floors.put(4, "Mina & CO.");
		floors.put(5, "Sema & CO.");
		floors.put(2, "Olga & CO.");
		floors.put(6, "Kamila & CO.");
		
		System.out.println("Original map: " + floors);
		System.out.println("The size of the map is: " + floors.size());
		
		String company = floors.get(4);
		System.out.println(company);
		
		Set<Integer> keys = floors.keySet();
		
		for(int key:keys) {
			System.out.println(key + "---" + floors.get(key));
		}
	
		
		Iterator<Integer> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			int key = iterator.next();
			System.out.println(key + "===" + floors.get(key));
			//System.out.println(iterator.next() + " +++ " + floors.get(iterator.next()));  this line will NOT work
		}
		
		System.out.println("    ------     ");
		
		Collection<String> values = floors.values();
		for(String value:values) {
			System.out.println(values);
		}
		
		Iterator<String> valuesIt = floors.values().iterator();
		
		while(valuesIt.hasNext()) {
			System.out.println(valuesIt.next());
		}
		
		System.out.println(" ---- ");
		
		String something = floors.values().iterator().next();
		System.out.println(something);
		
		int k = floors.keySet().iterator().next();
		System.out.println(k);
	}
	
	

}
