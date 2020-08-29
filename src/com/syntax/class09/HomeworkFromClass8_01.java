package com.syntax.class09;

import java.util.Scanner;

public class HomeworkFromClass8_01 {

//	Write a program that reads a range of 
//	integers (start and end point), provided by a 
//	user and then from that range prints the 
//	sum of the even and odd integers.
	// print also the total of all numbers
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int start, end; // I don't need to initialize them, bc I'll read from input
		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;
		
		
		System.out.println("Please, enter a starting number");
		start = scan.nextInt();
		System.out.println("Please, enter an ending number");
		end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) { // this is an Even number
				sumEven += i;
			} else { // odd number
				sumOdd += i;
			}
			//1st way
			//total += i;
			
			
		}
		System.out.println("Sum of even numbers is " + sumEven);
		System.out.println("Sum of odd numbers is " + sumOdd);
		//2nd way
		total = sumEven+sumOdd;
		System.out.println("The sum all of numbers is " + total);
	}
}
