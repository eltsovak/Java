package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {
	
	public static void main(String[] args) {
		
		// We need to store objects of Health, Pet, Car
		Set<Insurance> lset = new LinkedHashSet<>();
		lset.add(new Pet("Cat", "Cigna"));
		lset.add(new Car("Tesla", "Geico"));
		lset.add(new Health("Blue Cross Blue Shields"));
		
		// how to access variable and methods?
		
		for(Insurance ins:lset) {
			// accessing variables
			System.out.println(ins.insuranceName); 
			// calling methods
			ins.getQuote();
			ins.cancelInsurance();
			System.out.println("----------------");
			
		}
		
		System.out.println("--- Using Iterator----");
		Iterator<Insurance> it = lset.iterator();
		
		while(it.hasNext()) {
			Insurance i = it.next();
			// accessing variables
			System.out.println(i.insuranceName);
			// calling methods
			i.getQuote();
			i.cancelInsurance();
			System.out.println("--------");
		}
		
	}

}
