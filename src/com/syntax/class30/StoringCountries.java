package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;


public class StoringCountries {
	
	public static void main(String[] args) {
		
		Country[] countr = {new USA("USA"), new Afghanistan("Afghanistan"), new Kazakhstan("Kazakhstan")};
		
		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new USA("USA"));
		countries.add(new Afghanistan("Afghanistan"));
		countries.add(new Kazakhstan("Kazakhstan"));
		
		System.out.println("--Using regular for loop---");
		for(int i = 0; i < countries.size(); i++) {
			
			countries.get(i).election();
		}
		
		System.out.println("--Using enhanced for loop---");
		
		for(Country country:countries) {
			country.election();
		}
		
		System.out.println("--Using iterator---");
		Iterator<Country> it = countries.iterator();
		while(it.hasNext()) {
			it.next().election();
		}
		
	}

}
