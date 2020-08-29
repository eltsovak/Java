package com.syntax.class14;

public class StringMethodContinue {

	public static void main(String[] args) {

		System.out.println("-------.contains() method-----");

		// check if String contains another sequence of specified characters
		String str = "Good afternoon all";

		boolean contains = str.contains("afternoon");
		System.out.println(contains); // true

		String searchValue = "good";

		boolean isThere = str.contains(searchValue);
		System.out.println(isThere); // false - case sensitive

		System.out.println(str.contains("G")); // true

		System.out.println(str.contains("after")); // true

		System.out.println("-------.startsWith () method----");
		String drink = "water";
		boolean starts = drink.startsWith("w");
		System.out.println(starts); // true
		
		System.out.println("-------.endsWith () method----");
		boolean ends = drink.endsWith("a");
		System.out.println(ends); // false
		
		//drink.startsWith('w'); -> Compiler Error: we need to check if it starts with specified String, cannot be just char
		
		String str1 = "Hello Mohammad";
		String str2 = "Hello Bulat";
		
		System.out.println("String " + str1 + " " + str1.startsWith("Hello"));
		System.out.println(str2.endsWith("Bulat"));
		
		System.out.println("-------.equals() method----");
		
		String string1 = "Saturday";
		String string2 = "saturday";
		
		boolean equality = string1.equals(string2);
		System.out.println(equality); // false
		
		System.out.println("-------.equalsIgnoreCase() method----");
		
		boolean equalityNoCase = string1.equalsIgnoreCase(string2);
		System.out.println(equalityNoCase); // true
		
		
		// you can NOT use IgnoreCase here, when check an actual app
		String expected = "Password cannot be empty";
		String actual = "Password can not be empty";
		
		if (expected.equals(actual)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
		
		System.out.println("----- Real example of equals-----");
		
		// you can use IgnoreCase here
		String expectedBrowser = "Chrome";
		
		if (expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		} else {
			System.out.println("Test executed NOT on chrome browser");
		}
		
		

		
		
	}

}

