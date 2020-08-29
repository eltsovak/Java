package com.syntax.class20;

public class Task {

	
//	Write a program that will have a constructor: 
//		one with parameters and second without any parameters. 
//		Create a separate Test class where you will execute both 
//		of the constructors 1 by 1.
	
	Task(String str) {
		System.out.println("I am a constructor with a parameter " + str);
	}
	
	Task() {
		System.out.println("I am a constractor without a parameter");
	}

}

