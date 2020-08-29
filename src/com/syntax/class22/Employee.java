package com.syntax.class22;

public class Employee {

	public static String company = "NT"; // entire project
	protected String fullName;// same package unless inherited
	double salary;// same package
	private long ssn;// same class

	
	void work() {
		System.out.println("All emloyees are working");
	}
	
	void getPaid() {
		System.out.println("All employess are getting paid");
	}
	
	

}

