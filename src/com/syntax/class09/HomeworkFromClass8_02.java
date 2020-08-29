package com.syntax.class09;

import java.util.Scanner;

public class HomeworkFromClass8_02 {

	public static void main(String[] args) {

//		Write a program to ask a user to enter item
//		they want to buy and the price of that item.
//		Every time user enters money accumulate
//		the amount and tell the user how much is
//		left to pay off. If user give more money
//		program should return a change. Whenever
//		a user done with payments program should
//		say "Thank you for shopping!"

		Scanner scan = new Scanner(System.in);
		
        double money;
        double totalAmount = 0;
        double remainingBalance;
        double change;
        
		System.out.println("Please, enter the item you want to buy");
		String item = scan.next();

		System.out.println("Please, enter the price of the item");
		double price = scan.nextDouble();

		
		do {
			System.out.println("Please, enter the amount you want to pay");
			money = scan.nextDouble();
			totalAmount += money;
			
			if (totalAmount < price) {
				remainingBalance = price - totalAmount;
				System.out.println("Please, give me " + remainingBalance + " more");
			} else if (totalAmount > price) {
				change = totalAmount - price;
				System.out.println("Your change is: " + change);
			} else {
				System.out.println("Maaaan, you gave me exactly what you owed me!");
			}
			
		} while(totalAmount < price);
		
		System.out.println("Thank you for shopping!");

	}

} 
