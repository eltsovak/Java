package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitchCase {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your month birth!");
		String month = scan.next();
		
		String season = "Unknown";

//		if (month.equals("March") || month.equals("April") || month.equals("May")) {
//		System.out.println("You were born in Spring");
//	} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
//		System.out.println("You were born in Spring");
//	} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
//		System.out.println("You were born in Fall");
//	} else {
//		System.out.println("You were born in Winter");
		
		switch (month.toLowerCase()) { //.toLowerCase() converts December to december
		case "December":
		case "January":
		case "February":
			season = "Winter";
			break;
		case "March":
			//season = "Spring"; --> you can skip breaks and season = winter if all the cases have the same input
			//break;
		case "April":
		case "May":
			season = "Spring";
			break;
		case "June":
		case "July":
		case "August":
			season = "Summer";
			break;
		case "September":
		case "October":
		case "November":
			season = "Fall";
			break;
		default:
			season = "Unknown";
			
		}
		System.out.println ("You were born in " + season);
		System.out.println("---Task---");
		
		System.out.println("Please enter your country");
		String country = scan.next();
		String language = "Unknown";
		
		switch (country) {
		case "Russia":
			language = "Russian";
			break;
		case "USA":
			language = "English";
			break;
		case "Belarus":
			language = "Belarusian";
			break;	
		case "Egypt":
			language = "Arabic";
			break;	
		case "France":
			language = "French";
			break;	
		default:
			language = "Unknown";
		
	}
		System.out.println("Your language is " + language );
}
		

}


