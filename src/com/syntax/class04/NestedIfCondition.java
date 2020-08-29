package com.syntax.class04;

public class NestedIfCondition {
	
public static void main(String[] args) {
		
		// Check if patient has allergies
		// if no allergies -->  "You're healthy"
		// otherwise: 
		//if peanut allergy : "Don't eat peanut"
		// if lactose allergy: "Don't drink milk"
		// if bee allergy: Don't mess with bees"
		
		boolean allergies = true;
		boolean peanutAllergy = false;
		boolean lactoseAllergy = false; 
		boolean beeAllergy = true;
		
		if (allergies) {
			// patient has allergies, we need to check which one
			System.out.println("You have an allergy");
			if (peanutAllergy) {
				System.out.println("Don't eat penut");
			} else if (lactoseAllergy) {
				System.out.println("Don't driink milk");
			} else if (beeAllergy) {
				System.out.println("Don't mess with bees");
			}
		} else {
			// patient doesn't have allergies
			System.out.println("You're healthy");
		}
		
		System.out.println("_________________");
		
	   //Write a program to store a boolean value of whether user has diploma or not. 
		//If user has a diploma, you should say congratulations, 
		//otherwise program should suggest to get a degree. 
		//Then if user has a degree program should check a gpa score. 
		//If gpa score is higher or equals to 3.5 → 
		//output should say "You are eligible for scholarship", otherwise → 
		//"You should have studied harder" .
		
		
		boolean diploma = true;
		double gpa = 3.92;
		
		if (diploma) {
			System.out.println("Congratuations!");
			
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			
			} else {
				System.out.println("You should have studied harder");
			} 
	
            } else {
				System.out.println("You need to get a degree");
		}
		
		//2. Create a Java program and store values of mortgage rate and mortgage price.
				//First, program should check if rate is higher than 4.5 user
				//will not buy a house, otherwise user will consider buying. 
				//Once user decides to buy a house, if price of the house 
				//is larger than 200000 than user will take a loan, 
				//otherwise user will pay cash.
		
		System.out.println("________________");
		
		double rate = 9.5;
		int mortgage = 500000;
		
		if (rate > 4.5) {
			System.out.println("User will not buy the house");
		} else {
			System.out.println("Will consider buying the house");
			if (mortgage > 200000) {
				System.out.println("Will take a loan");
			} else {
				System.out.println("Will pay cash");
			}
		}
		    
		 
		    
		    
		
		
	}
		
	
}
		



