package com.syntax.class14;

public class StringMethods {

public static void main(String[] args) {
		
		
		//1st way to create a String, this is the most popular way
		String name = "Olga"; // literal, using String value
		
		//2nd way to create a String, using new keyword
		String name1 = new String();
		name1 = "Olga";
		
		System.out.println(name);
		System.out.println(name1);
		
		//methods of String class
		String school = "Syntax";
		// how to find out how many characters in the string
		int size = school.length(); 
		System.out.println("The length of the String is " + size);
		
		String greetings = "Hello Syntax";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString); // spaces are calculated
		
		System.out.println("----------.toUpperCase() method---------");
		
		String city = "Washington DC";
		String newCity = city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("----------.toLowerCase() method---------");
		
		String lowerCaseString = newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("------.concat() method-------");
		
		String country = "USA";
		String capital = "Washington DC";
		
		// + with Strings serves as concatenation operator
		// + with numbers serves as arithmetic operator
		
		System.out.println(country + "=" + capital);
		System.out.println(country.concat(capital)); // will work only if both values are of String type
		
		int day = 27;
		String month = "June";
		
		System.out.println(day+month);
		System.out.println(month+day);
		
		//System.out.println(month.concat(day)); -> can not use bc both values must be string
		//System.out.println(); CE: day is an int type and it does not have an access to String methods
		
		System.out.println("--------.isEmpty() method-------");
		
		// if length of the String is = 0 --> then it is Empty
		String str = "Hello";
		boolean isEmpty = str.isEmpty();
		
		System.out.println(isEmpty); // false, because not empty
		
		String str1 = "";
		System.out.println(str1.isEmpty()); // true, it is empty
		
		System.out.println("--------.trim() method-------");
		
		String cat = "My cat's name is Jessy";
		String dog = "             My dog's name is  Charly     ";
		System.out.println("----Before trimming----");
		System.out.println(cat);
		System.out.println(dog);
		
		System.out.println(cat.trim());
		System.out.println(dog.trim()); // cuts spaces before and after the String, NEVER in the middle
		
		
		
		
		
		
	}
	
	

}

