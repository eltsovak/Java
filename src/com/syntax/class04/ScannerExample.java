package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		// Capture the name from the user and print
			// Your name is ___
			
			// Ask the user to enter the age and print
			// Your name is ___ and age is __PPP
			
			// 1. We bring the Scanner Class to our program
			// System.in --> read from keyboard/console
			Scanner input = new Scanner (System.in);
			
			// We are instructing the user what to enter
			System.out.println("Please enter your full name!");	
			// We are capturing the whole line into a text variable
			String name	= input.nextLine();
			System.out.println("Your name is " + name);
			
			// We are instructing the user what to enter
			System.out.println("Please enter your age!");
			
			// We are capturing the text as an integer,
			// If it is in a double, then an error will be printed
			int age = input.nextInt();
			System.out.println("Your name is " + name + " your age is " + age);
			
			

		}

}
