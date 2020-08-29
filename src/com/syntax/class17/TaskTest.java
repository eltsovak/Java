package com.syntax.class17;

public class TaskTest {


	public static void main(String[] args) {
		
		Task t = new Task();
		String email = t.createEmail("Jane", "Smith", "gmail");
		System.out.println(email);
		
		boolean prime = t.isPrime(67);
		System.out.println(prime);
		
		Student student = new Student();
		char grade = student.getGrade(90);
		System.out.println(grade);
	}

}

