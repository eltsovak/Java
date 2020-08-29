package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		//int num = sc.nextInt(); // if type "fjdhj" --> InputMismatchException
		//How would handle InputMismatchException? 
		//Input Mismatch Exception when user enters mismatch value then programmer expected.
		
		try {
			int num = sc.nextInt();
			System.out.println(num);
		} catch (InputMismatchException me) {
			System.out.println(me);
		}
		
	}
	
	


}
