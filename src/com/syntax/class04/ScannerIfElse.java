package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	
public static void main(String[] args) {
		
		// Mac: command + shift + o --> shortcut
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter 2 numbers
		// Compare the numbers and print which one is larger
		
		System.out.println("Please, enter the first number!");
		int num1 = scanner.nextInt();
		System.out.println("Please, enter the second number!");
		int num2 = scanner.nextInt();
		
		System.out.println("Numbers are " + num1 + " and " + num2);
		
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
		System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
		
		

	}

}

