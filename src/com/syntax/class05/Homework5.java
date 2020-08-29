package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your month birth!");
		String month = scan.next();

		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("You were born in Spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("You were born in Spring");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("You were born in Fall");
		} else {
			System.out.println("You were born in Winter");
		}
		
		
		System.out.println("_________________");
		
		
//		Write a program to find largest 
//		number among three numbers using 
//		nested if provided by a user (numbers 
//		must be distinct)
		
		System.out.println("Please, enter the first number");
		int num1 = scan.nextInt ();
		System.out.println("Please, enter the second number");
		int num2 = scan.nextInt ();
		System.out.println("Please, enter the third number");
		int num3 = scan.nextInt ();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("The first number you have entered is the largest number");
		} else if (num2 > num1 && num2 >num3) {
			System.out.println("The second number you have entered is the largest number");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println ("The third number you have entered is the largest number");
		}
		

	}

}


