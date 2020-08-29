package com.syntax.class16;

public class MethodsWithReturnValue {

	public static void main(String[] args) {

		// create a String and based on the number of characters, define whether String
		// long or short
		// long if length > 10, short if less

		String str = "I love Java";

		int length = str.length();

		if (length >= 10) {
			System.out.println("Created String is long");
		} else {
			System.out.println("Created String is short");
		}

		// identify which number is the largest
		// and then define whether the largest number is even or odd

		Task obj = new Task();
		obj.isLarger(10, 20);

	}

	// create a method that will RETURN the largest value
	int largest(int a, int b) {
		int largest;

		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}

		return largest;

	}

}

