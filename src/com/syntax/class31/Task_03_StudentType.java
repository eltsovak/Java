package com.syntax.class31;

import java.util.HashSet;
import java.util.Set;

public class Task_03_StudentType {
	
	public static void main(String[] args) {
		
		Set <Student> student = new HashSet<>();
		student.add(new Student("Ksenia", 12345));
		
		for(Student std:student) {
			std.display();
		}
		
		
	}

}
