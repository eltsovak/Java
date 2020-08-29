package com.syntax.class05;

public class LogicalNot {
	
	public static void main(String[] args) {

		boolean b1 = !true;
		System.out.println(b1); // -> false

		boolean b2 = !false;
		System.out.println(b2); // -> true

		boolean cold = true;
		if (!cold) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}

		System.out.println("_____________");

		// If it is not Monday or Friday we have a class

		// 1st way
		int day = 5;

		if (day != 1 && day != 5) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}

		// 2nd way, similar to 1st

		if (!(day == 1) && !(day == 5)) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}

		// 3rd way, the easiest way


		if (!(day ==1 || day == 5)) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}

		System.out.println("-----Raining------");
		
		boolean isRaining = true;
		if (!isRaining) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

	}

}


