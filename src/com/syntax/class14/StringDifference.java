package com.syntax.class14;

public class StringDifference {

public static void main(String[] args) {
		
		String name = "Madeeha"; // literal
		
		String name1 = new String("Madeeha"); // new keyword
		//name1 = "Madeeha";
		
		System.out.println(name);
		System.out.println(name1);
		
		if (name.equals(name1)) {
			System.out.println("Strings are equal");
		}
		
		if (name==name1) { // we don't know why it's working :D if use // name1 = "Madeeha"
			System.out.println("Strings are equal ising == operator");
		}
		
	}

}
