package com.syntax.class08;

import java.util.Scanner;

public class HomeworkClassPrice {

public static void main(String[] args) {
		
//		Write a program to ask a user to enter item
//		they want to buy and the price of that item.
//		Every time user enters money accumulate
//		the amount and tell the user how much is
//		left to pay off. If user give more money
//		program should return a change. Whenever
//		a user done with payments program should
//		say "Thank you for shopping!"
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please, enter the item you want to buy");
		String item = scan.next();
		
		System.out.println("Please, enter the price of the item");
		double price = scan.nextDouble();
		
		System.out.println("Please, enter the amount you want to pay");
		double amountToPay = scan.nextDouble();
		
		
		if (amountToPay < price) {
			System.out.println("Please, pay " + (price-amountToPay) + " more");
		} else if (amountToPay > price)	{
			System.out.println("Your change is " + (price-amountToPay));
		
		}else {
		System.out.println("Thank you for shopping with us! Have a great day");
	}
	}
}

