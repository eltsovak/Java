package com.syntax.class25;

class Human{
	
	public void happy() {
		System.out.println("Humans are happy");
	}
	
	public void study() {
		System.out.println("Humans should study");
	}
}
public class Student extends Human {
	public void sleep() {
		System.out.println("All students love to sleep");
	}
	public void study() {
		System.out.println("All students study");
	}
	

}
class SyntaxStudents extends Student{
	
	public void inLoveWithJava() {
		System.out.println("Syntax students love JAVA the most");
	}
	public void study() {
		System.out.println("Syntax students studying harder than anyone else");
	}
	public void sleep() {
		System.out.println("Syntax students never sleep");
	}
}

class CollegeStudents extends Student{
	
	public void study() {
		System.out.println("School time is the best time");
	}
	public void read() {
		System.out.println("College students read tonns of books");
	}
}
