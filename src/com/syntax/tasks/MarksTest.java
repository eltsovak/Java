package com.syntax.tasks;

public class MarksTest {
	
	public static void main(String[] args) {
		
		Marks a = new A(67, 80, 97);
		System.out.println(a.getPercentage());
		
		Marks b = new B(76, 89, 99, 100);
		System.out.println(b.getPercentage());
	}

}
