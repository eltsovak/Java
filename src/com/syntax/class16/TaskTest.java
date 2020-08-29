package com.syntax.class16;

public class TaskTest {

public static void main(String[] args) {
		
		Task object = new Task();
		object.isLarger(100, 34);
		
		System.out.println("-------");
		
		object.oddOrEven(56);
		System.out.println("-------");
		
		object.palindrome("madam");
		System.out.println("-------");
		
		object.sayHello("egypt");
		object.sayHello("USA");
	
		
	}

}

