package com.syntax.class29;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Main {
	public static void main(String[] args) {

		LinkedList<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator<String> c = countries.iterator();
		while(c.hasNext()){
		  String country = c.next();
		  if(country.equals("Armenia") || country.equals("Australia") || country.equals("Azerbaijan"))
		    c.remove();
		  }
		  System.out.println(countries);
		}
	
}