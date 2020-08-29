package com.syntax.class04;

import java.util.Scanner;

public class HomeworkYearsWorked {
	
public static void main(String[] args) {
		
		//Write a program to ask user to enter numbers
		//of worked years and annual salary. If user
		//worked for more or equals to 5 years than user
		//is eligible for the bonus, otherwise he is not.
		//Once user is eligible and salary is larger than
		//50000 than bonus = 5000, otherwise bonus=3000.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please, enter the number of years you have worked?");
		int years = input.nextInt();
		System.out.println("Please, enter your annual salary");
		int salary = input.nextInt();
		
		if (years >= 5) {
			System.out.println("You are eligible for bonus");
			
			if (salary > 50000) {
				System.out.println("The bonus you are eligible for is 5000");
			} else if (salary < 50000) {
				System.out.println("The bonus you are eligible foris 3000");
			}
		} else {
			System.out.println("Sorry, you are not eligible for a bonus");
		}
		
	}

}



