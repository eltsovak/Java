package com.syntax.class16;

public class DifferentMethods {

	// Let's create method that says "hello" 10 times
	
		void sayHello(int times) {
			for (int i = 0; i < times; i++) {
				System.out.println("Hello"); 
			}
		}
		
		// create the method that will print any word any number times
		
		void printAnyWord(String word, int times) {
			
			for(int i = 0; i < times; i++) {
				System.out.println(word);
			}
		}
		
		// Let's create a method isHungry that will accept boolean value
		// and prints, if passed value is true --> go cook
		// otherwise --> go to study
		
		void isHungry (boolean areYouHungry) {
			
			if (areYouHungry) {
				System.out.println("Please cook for yourself");
			} else {
				System.out.println("Go ahead and study");
			}
		}

	}

