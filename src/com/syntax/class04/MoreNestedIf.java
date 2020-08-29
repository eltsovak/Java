package com.syntax.class04;

public class MoreNestedIf {
	
	public static void main(String[] args) {
		// Let's have a date of month and a day of week
		// If it's Friday --> We are going to watch a movie
		//     if date is 13 --> watch a scary movie
		//     if date is not 13 --> watch a comedy
		// if it's not Friday --> we are going to study java
		
		boolean isFriday = true;
		int date = 17;
		
		if (isFriday) {
			System.out.println("It is Friday. We are going to watch a movie");
		if (date == 13) {
			System.out.println("I will watch a scary movie");
		} else {
			System.out.println(" I will watch a comedy");
		} 
		} else {
			System.out.println("We are going to study Java");
		}

		
		
		
		
		
	}

}



