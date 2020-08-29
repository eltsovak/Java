package com.syntax.class03;

public class IfCondition {
	
public static void main(String[] args) {
		
		//Declare a number and compare if the number is larger than 100
		//If it is larger than 100, I will print --> My number is large
		
		int num = 178;
		
		boolean result = num > 100; //true
		System.out.println("Let us check");
		
		if (num > 100) {
			System.out.println("My number is large");	
		}else {
			System.out.println("My number is small");
		}
		
		System.out.println("The check is complete");
		
		//boolean result = num > 100;
		//if(result) {
		//	System.out.println("The result is true");
		//} 
		System.out.println("****************");
		
		int expectedHours = 15;
		int actualHours = 15;
		
		if (actualHours >= expectedHours) {
			System.out.println("You will love and understand Java");
		} else {
			System.out.println("You will not love and you'll not understand Java");
		}
		
		System.out.println("****************");
		
		double budget = 10000;
		double carPrice = 15000;
		
		if(budget > carPrice) { // I will buy only if I have more money
			System.out.println("I will buy this car");
			System.out.println("I am happy");
		} else { // otherwise
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
			System.out.println("I will find a job");
			System.out.println("Then, I will have money");
		}
		
		
		
	}

}
