package com.syntax.class23;

public class SuperClass {

String name = "Kamila";
	
	public void printHello() {
		System.out.println("Hello from parent class");
	}

}

class SubClass extends SuperClass{
	
	String name = "Mina"; // instance
	
	public void displayName() {
		System.out.println(this.name);//accessing current class variable
		System.out.println(super.name);//super always refers to a parent class
	}
	
	public void printHello() {
		System.out.println("Hello from child class");
	}
	
	
	public void callingParentMethod() {
		printHello();// this.printHello() is added automatically
		super.printHello();
	}
}

