package com.syntax.class19;

public class AccessingEmployeeMembers {

		
		public static void main(String[] args) {
			
			Employee emp = new Employee();
			emp.name = "Gozde";
			emp.lastName = "Doe";
			emp.age = 30;
			emp.salary = 100000;
			//emp.ssn --> won't be available because is private
			
			emp.displayName();
			emp.displayAge();
			emp.displaySalary();
			//emp.displaySsn() --> won't be available because it's private
			
			
			
		}

	}

