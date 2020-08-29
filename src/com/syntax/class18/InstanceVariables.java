package com.syntax.class18;

public class InstanceVariables {


	String name = "Yuriy"; // instance variable

	public static void main(String[] args) {

		String name = "Kristina"; // local variable
		System.out.println(name); // Kristina
		
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name); //Jane
		
		// would like to change from Kristina to Castro
		name = "Castro";
		System.out.println(name);
		
		// would like to change Jane to Ed --> hanging value of the instance variable
		obj.name = "Ed";
		System.out.println(obj.name); // Ed
		
		System.out.println("Printing value of name using 2 instance");
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
	}

}

