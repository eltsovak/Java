package com.syntax.class10;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// There are 4 floors
		// Room numbers go from 1.1 to 1.7 --> sout (i + "." + j);
		
		// Task: Ask the user how many floors does your hotel have?
		// And how many rooms in each floor?
		
		// If I want, I can read from a Scanner
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many floors does your hotel have?");
		
		int floors = scan.nextInt();
		
		System.out.println("How many rooms are there on each floor?");
		int rooms = scan.nextInt();
		
		for (int i = 1; i <= floors; i++) {
			// We just moved to a new floor
			System.out.print("Floor # " + i + " --> ");
			
			// We are iterating/ looping the room
		
			for ( int j = 1; j <= rooms; j++) {
				// to print 1111111, 222222 -> sout (i);
			System.out.print(i + "." + j + " ");
			
		}
			// The stairs to the next floor
			System.out.println();	
		}
		
		
	}

}

