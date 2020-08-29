package com.syntax.class06;

import java.util.Scanner;

public class HomeworkClass6 {
	
public static void main(String[] args) {
		
		
//		Allow user to enter grade and then provide 
//		explanation:
		//A-Excellent, B-Good, C-Average, DBad, any other grade --> Not Acceptable. At the 
//		end your program should print which grade was 
//		entered by a user with explanation.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please, enter your grade");
		char grade = scan.next().charAt(0);
		String explanation;
		
		switch (grade) {
		case 'A' :
			explanation = "Excellent";
			break;
		case 'B' :
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D' :
			explanation = "Bad";
			break;
		default	:
			explanation = "Not Acceptable";
		}
		
		System.out.println("Your grade is " + grade + " which is " + explanation);

		
		
		System.out.println("-----Task 2-----");
		
//		Using scanner class create 
//		calculator. Allow user to enter 2 numbers and 
//		operator(+,-,*,/). Based on operator provide the 
//		result to user.
		
		System.out.println("Please, enter the first number");
		double num1 = scan.nextDouble();
		
		System.out.println("Please, enter the second number");
		double num2 = scan.nextDouble();
		
		System.out.println("Please, enter the operator you want to use");
		char operator = scan.next().charAt(0);
		
		double result;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		break;
		case '/':
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		break;
		default:
			System.out.println("Invalid");;
		}
		
		
	}


}
