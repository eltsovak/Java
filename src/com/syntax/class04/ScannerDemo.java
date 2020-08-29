package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	
public static void main(String[] args) {
		
		int a = 65;
		String s = "bla";
		
		Scanner  scan = new Scanner (System.in);
	
	System.out.println("Plese write some text and press enter!");	
	String text	= scan.nextLine();
	System.out.println("________________");
	System.out.println(text);
	
	// int a = 33.4; // compile-time error
	
	// Let me read an integer (age)
	System.out.println("Please enter your age!  It should be a number!");
	int age = scan.nextInt(); // If not an integer, run time error
	System.out.println("The age that you entered is " + age);
		
		
		
		

	}

}



