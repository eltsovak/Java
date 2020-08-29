package com.syntax.class11;

public class RetreiveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		// getting all elements

		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ",");
		}
		System.out.println();

		System.out.println("------Print using advanced/enhanced loop, for each loop-------");

		for (char element : grades) {
			System.out.print(element + " ");

		}
		System.out.println();

		System.out.println("=============");
		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };

//		fruits[2] = null;
//		fruits[3] = null;
//		fruits[4] = null;

		// print all the fruits in two different ways
		// 1st way
		for (int j = 0; j < fruits.length; j++) {
			if (fruits[j].equals("Grapes")) {
				System.out.println(fruits[j] + " is my favorite fruit");
			} else {
				System.out.print(fruits[j] + " ");
			}
		}

		System.out.println();
		// 2nd way
		for (String f : fruits) {
			System.out.println(f);
		}

	}

}

