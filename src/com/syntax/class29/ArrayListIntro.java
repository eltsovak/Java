package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		// to add values to arraylist
		arrayList.add("Hello");// index 0
		arrayList.add("Welcome");// index 1
		arrayList.add("How are you");// index 2
		
		System.out.println("Original arrayList is " + arrayList);
		
		//how many elements are inside my ArrayList
		
		int arrayListSize = arrayList.size();
		System.out.println("Size of the original arrayList is " + arrayListSize);
		
		// how to access elements from ArrayList?
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);
		
		// I would like to add more Objects into ArrayList
		arrayList.add("Good bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of the ArrayList after adding more String Objects is " + arrayList.size());
		System.out.println("ArrayList after adding some Objects is " + arrayList);
		
		//Let's remove "Hello"
		arrayList.remove(0);
		
		System.out.println("Size of the arrayList after removing Object is " + arrayList.size());
		System.out.println("ArrayList after removing Objects is " + arrayList);
		// I want to update value "Good bye" --> "Bye"
		arrayList.set(2, "Bye");
		System.out.println(arrayList);// to check if it's updated
		
		
		
	
	}

}
