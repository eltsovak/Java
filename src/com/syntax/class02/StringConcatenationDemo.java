package com.syntax.class02;

public class StringConcatenationDemo {
	

	public static void main(String[] args) {
		
		//I love Castro
		
		String name1 = " Castro";
		System.out.println(name1);
		System.out.println("I love"+ name1);
		System.out.println("I love"+ " "+name1);
		String statement = "I love";
		
		//I don't want to change my variables;
		System.out.println(statement+name1);
		
		String car = "BMW";
		int year = 2020;
		
		//Concantenation of two Strings
		System.out.println("BMW of year "+2020);
		
		//Concantenation of a string with a variable of type int
		System.out.println(car+" of year "+ year);
		
		
		
		String name = "Ksenia";
		String lastName = "Yeltsova";
		String city = "Brooklyn";
		String state = "NY";
		String phoneNumber = "347-705-4370";
		System.out.println("My name is " + name + " and my last name is "+ lastName+".");
		System.out.println("I live in city of "+ city+ " state "+ state +" and my phone number is "+ phoneNumber+"!");;
		System.out.println("____________________");
		
		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber + "!");

	}

}
