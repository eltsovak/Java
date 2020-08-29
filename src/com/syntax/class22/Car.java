package com.syntax.class22;

public class Car {


	String make;
	
	
	public Car(String make) {
		this.make = make;
		// super();// automatically, calls a constructor of the Object
		//System.out.println("I am not argument constructor");
	}
}
	
	class Tesla extends Car {
		
		boolean autopilot;
		
		public Tesla(String make, boolean autopilot) {
			super(make); // associate with a parent class
			this.autopilot = autopilot;
			//System.out.println("I am non argument constructor of a child class");
		}
		
		void info() {
			System.out.println("We build " + make + " that has auotopilot feature = " + autopilot);
		}
		
	}



