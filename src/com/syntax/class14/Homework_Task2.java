package com.syntax.class14;

public class Homework_Task2 {

	public static void main(String[] args) {

//		Create a String and if the String is not empty perform the following: 
//			if the String has an odd number of characters and has 3 or more 
//			characters, print the character in the middle of the String.
//		

		String name = "Ksenia";
		boolean isEmpty = name.isEmpty();
		int size = name.length();
		

		if (!isEmpty) {

			if (size % 2 == 1 && size >= 3) {
				System.out.println("The character in the middle of the String " + name + " is: " + size / 2);

			} else {
				System.out.println("The String has an even number of charcters or has less than 3 characters in it");
			}

		}
	}
}
