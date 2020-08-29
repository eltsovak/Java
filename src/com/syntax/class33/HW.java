package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW {
	
	public static void main(String[] args) {
		
		Map<String, Integer> cities = new TreeMap<>();
		cities.put("Paris", 5);
		cities.put("Moscow", 6);
		cities.put("Washington DC", 13);
		cities.put("Vienna", 8);
		cities.put("Istanbul", 25);
		cities.put("Minsk", 4);
		cities.put("Kyiv", 2);
		
		Set<String> keys = cities.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			if(key.length()>7) {
				it.remove();
			}
		}
		System.out.println(keys);
		
		System.out.println(cities);
		
		System.out.println("-----Improved way----");
		
		String[] citi = {"Washington DC", "Los Angeles", "New York", "Miami", "Minsk"};
		
		Map<String, Integer> cityMap = new TreeMap<>();
		
//		for (int i = 0; i < citi.length; i++) {
//			cityMap.put(citi[i], citi[i].length());
//		}
		
		for(String c:citi) {
			///if(c.length() < 7) {
				cityMap.put(c, c.length());
			//}
			
		}
		
		System.out.println(cityMap);
		
		 Iterator<Entry<String, Integer>> iterator = cityMap.entrySet().iterator();
		 
		 while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			if(entry.getValue() > 7) {
				iterator.remove();
			}
			
		 }
		 
		 System.out.println("Map after removal " + cityMap);

		
	}

}
