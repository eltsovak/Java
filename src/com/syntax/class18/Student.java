package com.syntax.class18;

public class Student {

//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String name;
	int studentID;
	static int numberOfStudents;
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name = "Ummar";
		student1.studentID = 345;
		Student.numberOfStudents++;
		
		Student student2 = new Student();
		student2.name = "Kate";
		student2.studentID = 127;
		Student.numberOfStudents++;
		
		Student student3 = new Student();
		student3.name = "Leah";
		student3.studentID = 456;
		Student.numberOfStudents++;
		
		System.out.println("The total number of students is " + Student.numberOfStudents);
		
	
	}
}
