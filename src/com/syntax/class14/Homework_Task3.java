package com.syntax.class14;

import java.util.Scanner;

public class Homework_Task3 {

	
//	Create a String and print it in reverse order (Sunday → yadnuS).
	
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
	System.out.println("Please, enter a String");
	String string = scan.nextLine();
	String reverse = "";
	
	for(int i = string.length() - 1; i >= 0; i--) {
		reverse += string.charAt(i);
	}
	System.out.println("Reversed string is: " + reverse);
	
	}

}
