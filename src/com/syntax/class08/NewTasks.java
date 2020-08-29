package com.syntax.class08;

import java.util.Scanner;

public class NewTasks {

public static void main(String[] args) {
		
		// print numbers from 1 to 50 except those that are divisible by 3
		
		for (int i = 1; i <= 100; i++) { // divisible by 3
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("-----Task 2-----");
		//Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
		
		Scanner scan = new Scanner (System.in);
		
		for (int ask = 1; ask <= 10; ask++) {
			System.out.println("Do you want to apply for a credit card? Please type: Yes or No");
			String answer = scan.next();
			
			if (answer.equals("Yes")) {
				System.out.println("Congrats, now you are in debt :D");
				break;
			}
		}
	}

}
