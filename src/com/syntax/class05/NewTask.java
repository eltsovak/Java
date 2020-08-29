package com.syntax.class05;

import java.util.Scanner;

public class NewTask {
	
	public static void main(String[] args) {

		// Prompt the user to enter person heights in inches.
		// Person should be classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner scan = new Scanner(System.in);

		System.out.println("Please, enter your height");
		int height = scan.nextInt();

		if (height < 60) {
			System.out.println("You are short");
		} else if (height >= 60 && height < 72) {
			System.out.println("You are medeium");
		} else if (height >= 72) {
			System.out.println("You are tall");
		} else {
			System.out.println("Sorry, invalid number");
		}

		System.out.println("---2---");

		// 2.Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output "It is a weekday",
		// anyday from 6-7 → output "It is a weekend",
		// any other day → output "Invalid day"

		System.out.println("Which number of the day of the week it ? (Example: 6)");

		int day = scan.nextInt();

		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");

		} else if (day >= 6 && day <= 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("-----using OR------");
		
		// check Canvas

		// 3. Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores) and determine the grade based on the following rules:
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F
		
		System.out.println("What is your quiz score?");
		double quizz = scan.nextDouble();
		System.out.println("What is your mid term score?");
		double midTerm = scan.nextDouble();
		System.out.println("What is your final score?");
		double finalScore = scan.nextDouble();
		double aver = quizz + midTerm + finalScore;


		if (aver >= 90) {
			System.out.println("grade A");

		} else if (aver >= 70 && aver < 90) {
			System.out.println("grade B");
		} else if (aver >= 50 && aver < 70) {
			System.out.println("grade C");
		} else if (aver >= 50 && aver < 70) {
			System.out.println("grade F");
		} else {
			System.out.println("Invalid grade");
		}

	}

}



