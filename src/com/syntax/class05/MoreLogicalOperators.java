package com.syntax.class05;

public class MoreLogicalOperators {
	
	public static void main(String[] args) {

		// We have 7 days of the week.
		// If day is 2, 4 --> SDLC class
		// If day 6, 7 --> Java class
		// If day is 3 --> Review class
		// If day is 1, 5 --> No class

		int day = 3;
		// To compare the equality of two numbers we use ==

		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("Java class");
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else {
			System.out.println("Wrong day");

			System.out.println("----Using String-----");

			// To compare the equality of 2 Strings we use .equals

			String day2 = "Wednesday";

			if (day2.equals("Tuesday") || day2.equals("Thursday")) {
				System.out.println("SDLC class");
			} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
				System.out.println("Java class");
			} else if (day2.equals("Friday") || day2.equals("Monday")) {
				System.out.println("No class");
			} else if (day2.equals("Wednesday")) {
				System.out.println("Review class");
			} else {
				System.out.println("Not implemented");
			}

		}

	}

}



