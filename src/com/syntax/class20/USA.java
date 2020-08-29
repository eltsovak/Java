package com.syntax.class20;

public class USA {

	// define 2 variables for state and capital and have a constructor to initialize it.
	
		public static String country;
		String state; // instance
		String capital;
		
		USA(String usaState, String stateCapital) { // local
			state = usaState;
			capital = stateCapital;
			
		}
		
		public void display() {
			System.out.println("State is " + state + " and its capital is " + capital);
		}

	}

