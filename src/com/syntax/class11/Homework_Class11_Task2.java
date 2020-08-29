package com.syntax.class11;

public class Homework_Class11_Task2 {

public static void main(String[] args) {
		
//		Create an array of countries: north 
//		america countries, south america 
//		countries, europe countries, asian 
//		countries, african countries. Then 
//		print all values from that array using 
//		2 different loops and calculate how 
//		many total countries been stored.
		
		String[][] countries = {{"USA", "Mexico", "Canada"}, {"Colombia", "Brazil", "Argentina"}, {"France", "Italy", "Spain"}, {"China", "Japan", "India"}, {"Egypt", "Kenya", "Nigeria"}};
		
		System.out.println("---Using NESTED FOR loop-----");
		for (int r = 0; r < countries.length; r++) {
			for (int c = 0; c < countries[r].length; c++) {
				String country = countries[r][c];
				System.out.print(country + " ");
			}
			System.out.println();
		}
		
		System.out.println("----Using EDVANCED FOR LOOP-----");
		
		for (String[] array: countries) {
			for (String country: array) {
				System.out.print(country + " ");
			}
			System.out.println();
		}
		
		int row = countries.length;
		int column = countries[0].length;
		int total = row*column;
		System.out.println();
		System.out.println("There are " + total + " countries");
	
		
		
	}

}

