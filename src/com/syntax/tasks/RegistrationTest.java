package com.syntax.tasks;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		Registration r = new Registration();
		r.setEmail("gp@yahoo.com");
		System.out.println(r.getEmail());
		
		r.setUserName("girls power");
		System.out.println(r.getUserName());
		
		r.setPassword("girls");
		System.out.println(r.getPassword());
	}

}
