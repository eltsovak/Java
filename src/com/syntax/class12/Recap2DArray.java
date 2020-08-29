package com.syntax.class12;

public class Recap2DArray {

public static void main(String[] args) {
		
		String[][] animals = {{"cat", "dog", "bird", "hamster"}, // first array or 1 row
		{"tiger", "children", "bear"}, // second array or 2 rows
		{"salmon", "shrimp", "sea bass"}
		};
		
		int howManyArrays = animals.length; // how many rows
		System.out.println(howManyArrays);
		
		int howManyElemntsAreInTheSecondArray = animals[1].length; // how many columns in the 2nd row
		System.out.println(howManyElemntsAreInTheSecondArray);
		
		int howManyElemntsAreInTheFirstArray = animals[0].length; // how many columns in the 1st row
		System.out.println(howManyElemntsAreInTheFirstArray);
		
		String element = animals[1][1];
		System.out.println(element); // wanna retrieve "children"
		
		System.out.println("-------------Using FOR LOOP-----------");
		// how to get all elements from 2D Array
		
		for (int r = 0; r < animals.length; r++) { // loops over rows or 1d arrays
			for (int c = 0; c < animals[r].length; c++) {
				String animal = animals[r][c];
				System.out.print(animal + " ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("-------------Using ENHANCED FOR LOOP-----------");
		
		for (String[] array:animals) {
			for (String animal:array) {
				System.out.print(animal + " ");
			}
			System.out.println();
		}
		
		
	}

}

