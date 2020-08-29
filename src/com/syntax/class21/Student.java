package com.syntax.class21;

public class Student {

//	Write a Student class   that have instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method.
	
	String name;
	String address;
	
	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println("Student's name is " + name + " and his address is " + address);
	}
	
	public static void main(String[] args) {
		
		Student std = new Student("Jenny", "9 Mulberry Street");
		std.displayInfo();
		
	}

}
