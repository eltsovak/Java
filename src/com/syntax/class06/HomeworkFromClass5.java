package com.syntax.class06;

import java.util.Scanner;

public class HomeworkFromClass5 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the first number");
		double a = scan.nextDouble ();
		System.out.println("Please enter the second number");
		double b = scan.nextDouble ();
		System.out.println("Please enter the third number");
		double c = scan.nextDouble ();
		
		
		//double a=1, b=9, c=1;
		double largest;
		
		// first way. For this way we need a default value!!!!!
		// double largest = 0;
//		if (a>b && a > c) {
//			largest = a;
////			System.out.println("The largest number is " + a);
//		} else if (b>a && b>c) {
//			largest = b;
////			System.out.println("The largest number is " + b);
//		} else if (c>a && c>b) {
//			largest = c;
////			System.out.println("The largest number is " + c);
//			
		
///		2nd way
		
		if (a>b && a > c) {
			// a is the largest
			largest = a;
		} else if (b > c) { // a is not the largest, I am compating b and c
			largest = b;
		} else { // a is not the largest, b is not the largest
			//c is the largest
			largest = c;
		}
			System.out.println("The largest number is " + largest);
		}
	}


