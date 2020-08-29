package com.syntax.class10;

public class ArrayLength {

	public static void main(String[] args) {

		// how to find how many elements are in the array

		String[] group1 = new String[5];

		group1[3] = "Kamila";
		group1[1] = "Elshan";
		group1[4] = "Yuriy";

		System.out.println(group1[0]);
		System.out.println(group1[1]);

		int arrLength = group1.length; // can just say group1.length
		System.out.println("The length of group 1 is: " + arrLength);
		
		System.out.println("----------");
		
		String[] group2 = {"Ali", "Ksenia", "Olga", "Castro"};
		System.out.println("The length of group 2 is: " + group2.length);
		
		// HW create an array of 4 integers and see the default values

	}

}

