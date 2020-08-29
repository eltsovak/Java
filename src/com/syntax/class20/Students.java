package com.syntax.class20;

public class Students {

//	Write a java program of Class Students that 
//	takes students name and 3 subject grades. Inside your class also
//	have a method to Calculate Average Grade. Test Student class for 5 different
//	students with different marks. 
//	Your program should print an average mark of each students name.
	
	String name;
	int grade1, grade2, grade3;
	
	Students(String studentName, int gradeNum1, int gradeNum2, int gradeNum3) {
		name = studentName;
		grade1 = gradeNum1;
		grade2 = gradeNum2;
		grade3 = gradeNum3;
	
	}
	
	int calculateAverage() {
		int average = (grade1 + grade2 + grade3) / 3;
		return average;
	}
	
	
	}





