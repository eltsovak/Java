package com.syntax.class25;

public class StudentTest {

public static void main(String[] args) {
		
		SyntaxStudents syntax = new SyntaxStudents();
		syntax.study();
		syntax.sleep();
		syntax.inLoveWithJava();
		
		System.out.println("---Creating an object of College Student----");
		CollegeStudents col1 = new CollegeStudents();
		col1.read();
		col1.sleep();
		col1.study();
		
		System.out.println("---Creating an object of student----");
		Student std = new Student();
		std.sleep();
		std.study();
		
		System.out.println("---Creating an object of college student throught reference os Student(parent) class----");
		Student obj = new CollegeStudents();
		obj.study();
		obj.sleep();
		
		System.out.println("---Creating an object of college Syntax student throught reference os Student(parent) class----");
		Student ss = new SyntaxStudents();
		ss.sleep();
		ss.study();
	}

}

