package com.syntax.class05;

import java.util.Scanner;

public class HomeworkFromClass {
	
	public static void main(String[] args) {

		// Create a Java program that will ask if user has a
		// credit card or not. If you user does not have a
		// credit card then offer them. If they do have one
		// ask what is balance on the card? If balance of
		// the card is larger than 1000, tell them to pay off
		// immediately, otherwise you can tell them that they can spend more.

		Scanner scan = new Scanner(System.in);

		boolean cc;

		System.out.println("Do you have a credit card? (True or false)");
		cc = scan.nextBoolean();

		if (cc) {
			System.out.println("What is your credit card balance?");

			double balance = scan.nextDouble();

			if (balance > 1000) {
				System.out.println("Please, pay off immediately!");
			} else {
				System.out.println("You can spend more");
			}

		} else {
			System.out.println("Let me offer our best Credit Card to you");
		}

	}

}



