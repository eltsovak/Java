package com.syntax.class08;

import java.util.Scanner;

public class HomeworkClass8 {

	public static void main(String[] args) {
		
//		Write a program that reads a range of 
//		integers (start and end point), provided by a 
//		user and then from that range prints the 
//		sum of the even and odd integers.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please, enter the start point (a whole number)");
		int startPoint = scan.nextInt();
		
		System.out.println("Please, enter the end point (a whole number)");
		int endPoint = scan.nextInt();
		
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int i = startPoint; i <= endPoint; i++ ) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
			
		}
		System.out.println("The sum of even integers between " + startPoint + " and " + endPoint + " is " + sumEven);
		System.out.println("The sum of odd integers between " + startPoint + " and " + endPoint + " is " + sumOdd);
		
	
	}

}
