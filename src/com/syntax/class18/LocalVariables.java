package com.syntax.class18;

public class LocalVariables {

public static void main(String[] args) {
		
		String name = "Mohammad";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Today is a Java Class");
			System.out.println(i);
		}
	//System.out.println(i); CE: i cannot be resolved to a variable
		
		// String name = "Ali";
		
		int a; // declare a variable
		for(a = 0; a <= 3; a++) { // don't declare with inr again, just assign
			System.out.println(a);
		}
		System.out.println(a);
	}
	
	void displayName() {
		//System.out.println(name); CE: name cannot be resolved to a variable
		// name is not visible to the displayName method because it's local to main
	}
	
	// create a method to return sum of 2 numbers
	int sum(int num1, int num2) { // num1 and num2 local variables to method sum
		return num1 + num2;
	}
	
	double div(double num1, double num2) {// num1 and num2 local variables to method div
		return num1 / num2;
	}

}

