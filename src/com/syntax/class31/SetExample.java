package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		//creating an object of HashSet
		HashSet<String> brand = new HashSet<>();
		brand.add("Nike");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Adidas");
		brand.add("H&M");
		
		System.out.println(brand.size());
		System.out.println(brand);
		
		// how to verify if element is there
		boolean isItThere = brand.contains("Nike");
		System.out.println(isItThere);
		
		// how to access element from a Set collection?
		//brand.get -> is not available to Objects of Set Type
		
		//* with iterator 
		
		Iterator<String> brandIt = brand.iterator();
		String obj = brandIt.next();
		System.out.println(obj);
		
		obj = brandIt.next();
		System.out.println(obj);
		
		//* with loop
		System.out.println("--- Using while loop to get values from iterator collection---");
		while(brandIt.hasNext()) {
			obj = brandIt.next();
			System.out.println(obj);
		}
		// if we need to iterate over entire collection again we need NEW ITERATOR OBJECT
		System.out.println("--- Using while loop to get values from it object---");
		
		Iterator<String> it = brand.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// is there other way to get all elements from Set collection?
		System.out.println("--- Using enhanced for loop to get values from set object---");
		for(String br : brand) {
			System.out.println(br);
		}
		
		System.out.println("---- Creating an object of LinkedHashSet----");
		
		LinkedHashSet<String> luxBrand = new LinkedHashSet<>();
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		
		
		System.out.println(luxBrand.size());
		System.out.println(luxBrand);
		
		System.out.println("---- Creating an object of TreeSet----");
		
		TreeSet<String> allBrands = new TreeSet<>(brand);
		allBrands.add("Calvin Klein");
		allBrands.addAll(luxBrand); 
		
		System.out.println(allBrands);// [Adidas, Calvin Klein, Chanel, Gucci, H&M, LV, Nike, Prada, Uniqlo, Zara]
		
		// go over all the objects
		
		Iterator<String> iterator = allBrands.iterator();
		
		while(iterator.hasNext()) {
		String br = iterator.next();
		System.out.println(br);
		}
		
		System.out.println("---- Creating an object of TreeSet to store Double----");
		
		Set<Double> tset = new TreeSet<>();
		tset.add(10.99);
		tset.add(1.99);
		tset.add(100.99);
		tset.add(10.01);
		tset.add(110.99);
		
		System.out.println(tset);
		
		
		
		
	}
}
