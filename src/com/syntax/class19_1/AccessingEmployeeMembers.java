package com.syntax.class19_1;

import com.syntax.class19.Employee; // to import shortcut is cmd + shift + o

public class AccessingEmployeeMembers {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.name = "Olivia";// accessing public variables
		emp.lastName = "Luis";// accessing public variables

//		emp.age --> protected not visible
//		emp.salary --> default not visible
		// emp.salary --> private not visible

		emp.displayName(); // public method

	}

}
