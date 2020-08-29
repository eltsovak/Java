package com.syntax.class04;

import java.util.Scanner;

public class HomeworkCreditCard {
	
public static void main(String[] args) {
		
		//Create a Java program that will ask if user has a
		//credit card or not. If you user does not have a
		//credit card then offer them. If they do have one
		//ask what is balance on the card? If balance of
		//the card is larger than 1000, tell them to pay off
		//immediately, otherwise you can tell them that
		//they can spend more.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Do you have a credit card? Please type: yes or no");
		String answer = scan.next();
		String yes = "Yes";
		String no = "No";
		int balance;
		
		if (answer.equalsIgnoreCase (no)) {

			System.out.println("Do you want to apply for a credit card?");
		} else if (answer.equalsIgnoreCase(yes)) {
			System.out.println("What is the balance on your credit card?");
		}
		 balance = scan.nextInt();
			if (balance >= 1000) {
				System.out.println("Please, pay off the balance immideatly!");
			} else {
				System.out.println("You can spend more");
			}
		
		
		
		
	}

}



