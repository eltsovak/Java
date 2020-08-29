package com.syntax.class14;

import java.util.Scanner;

public class Homework_Task1 {

	public static void main(String[] args) {
		
//		Write a program that reads two people's first
//		names and if they expecting boy or girl? 
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY
//
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? girl
//		Suggested baby name: MAIEL
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter mom's first name");
		String momsName = scan.nextLine();
		
		System.out.println("Please, enter dad's first name");
		String dadsName = scan.nextLine();
		
		System.out.println("Who are expecting? Boy or Girl?");
		String child = scan.nextLine();
		
		// could do with String = babyName;
		
		String babyBoy = dadsName.substring(0,dadsName.length()/2).concat(momsName.substring(momsName.length()/2));
		String babyGirl = momsName.substring(0, momsName.length() / 2).concat(dadsName.substring(dadsName.length() / 2));
		 // could you .length() - 2/3
		if (child.equalsIgnoreCase("Girl")) {
			
			System.out.println("Suggested baby name is: " + babyGirl.toUpperCase());
		} else if (child.equalsIgnoreCase("Boy")) {
			System.out.println("Suggested baby name is: " + babyBoy.toUpperCase());
		}
		
		


		
		
	}

}
