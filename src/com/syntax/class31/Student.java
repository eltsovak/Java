package com.syntax.class31;

public class Student {
	
	String name;
	int studentID;
	
	Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	public void display() {
		System.out.println("Student's name is " + name + " and the stident's ID is " + studentID);
	}

}
