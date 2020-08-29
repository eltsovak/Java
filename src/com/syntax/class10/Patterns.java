package com.syntax.class10;

public class Patterns {

public static void main(String[] args) {
		
		// Let's print The Dollar
		// $$$$
		// $  $
		// $  $
		// $  $
		// $$$$
		
		for (int r = 1; r <= 5; r++) { // The outer loop controls the rows
			
			for (int c = 1; c <= 4; c++) { // The inner loop controls the columns
				
				if (r == 1 || r == 5) {// in the first or last row print everything
					System.out.print("$");
					
				} else { // In the other rows
					
					if (c == 1 || c == 4) { // if in the first or the last column - print $
						System.out.print("$");
						
					} else { // in the other column print " "
						System.out.print(" ");
					}
					
					
					
				
				}
				
				
			}
			System.out.println();
		}
		
		// HW Re-do this task without using nested if 
		// Hint: you should use logical && + ||
	}

}

