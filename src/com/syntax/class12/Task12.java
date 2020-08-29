package com.syntax.class12;

public class Task12 {

	public static void main(String[] args) {
		/* create a 2D Array that will store food of different kinds
		 * retrieve the values using regular and enhanced for loop
		 */
		
		String[][] foods = {{"Pizza", "Pasta"}, {"Soup", "Burgers", "Fries"}, {"Borscht", "Draniki"}};
		
		System.out.println("-----Using NESTED LOOP------");
		for (int r = 0; r < foods.length; r++) {
			for (int c = 0; c < foods[r].length; c++) {
				String food = foods[r][c];
				System.out.print(food + " ");
			}
			System.out.println();
		}
		System.out.println("-----Using FOR ENHANCED LOOP------");
		
		for (String [] array:foods) {
			for (String food: array) {
				System.out.print(food + " ");
			}
			System.out.println();
		}
		
	}

}

