package com.syntax.class10;

public class ArrrayTasks {


//	1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
//	Then print a grade B (use 2 different ways of creating an array).
	public static void main(String[] args) {

		// 1st way

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[2]);

		// 2nd way
		char secondGrade = grades[2];
		System.out.println(secondGrade);

		System.out.println("----Task 2-----");

//	Create an array of names and store all names of your group. 
//	Then print your name from that array. (use 2 different ways of creating an array).
     // 1st way
		String[] names = { "Ksenia", "Volha", "Ahmet", "Olga", "Andreii", "Mariama" };
		System.out.println(names[0]);
//2nd way
		String myName = names[0];
		System.out.println(myName);
		
		System.out.println("----Task 3 -----");
		
//		Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: 
		//“Saturday is Java coding Day”.
		
		//1st way
		String[] words = { "Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

		

	}

}

