package com.syntax.class03;

public class HomeworkDays {
	
public static void main(String[] args) {
		
        int day = 6;
		
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
		    System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid day");
		}
		System.out.println("_____________");
		
		int month = 6;
		
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
		    System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
		    System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("It is invalid month");
		}
		
		System.out.println("______________");
		
		// the first way
		int number = 27;
		if (number > 0) {
			System.out.println("The number is positive");
		} else if (number < 0) {
			System.out.println("The number is negative");
		}
		
		//the second way. Both ways are acceptable
		
		if (number > 0) {
			System.out.println("The number is positive");
		} else if (number == 0) {
			System.out.println("The number is zero");
		} else {
			System.out.println("The number is negative");
		}
		
		 System.out.println("___________");
		 
		 //one example
		 int num1 = 19;
		 if (num1 % 2 == 0) {
			 System.out.println("The number is Even");
		 } else {
			 System.out.println("The number is Odd");
		 }
		 
		 //second example
		 int num3 = 67;
		 int remainder = num3 % 2;
		 
		 if (remainder == 0) {
			 System.out.println(num3 + " is even!");
		 } else {
			 System.out.println(num3 + " is odd!");
		 }
		
		
		
		
	}

}
