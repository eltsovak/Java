package com.syntax.class11;

public class Largest {

	public static void main(String[] args) {

		// Find the largest number in array

		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };

		int largest = 0;
		for (int num : numbers) {
			if (num > largest) {
				largest = num;
			}

		}
		System.out.println(largest + " is the largest");

		System.out.println("----with negative numbers------");

		int[] numbersNegative = { -23, -56, -73, -16, -80, -70, -39 };

		int largestNeg = numbersNegative[0];
		for (int numNeg : numbersNegative) {
			if (numNeg > largestNeg) {

				largestNeg = numNeg;
			}
		}
	}
}

