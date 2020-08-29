package com.syntax.class22;

public class TestEmployee {

	public static void main(String[] args) {
		

		
		DifferentMembers employee1 = new DifferentMembers();
		
		Employee.company = "Apple";
		employee1.salary = 123000;
		employee1.work();
		employee1.getPaid();
		//employee1.ssn - not visible
		
		employee1.attendsMeetings();
		employee1.workOnBuildingSowtware();
		
		employee1.communicate();
		
		
		
		}
	}
