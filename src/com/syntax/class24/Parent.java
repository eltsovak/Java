package com.syntax.class24;

public class Parent {

	private void hello() { // private method does not participate in inheritance --> cannot override it
		System.out.println("Hello from parent class");
	}
	
	protected static void hi() {
		System.out.println("Hi from parent class");
	}

}

class Child extends Parent {
	
	//@Override --> no overriding, bc no inheritance. Private doesn't participate in the inheritance
	// creating own private method inside child class
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	//@Override --> can NOT override static method
	public static void hi() {
		System.out.println("Hi from the child class");
	}

}

