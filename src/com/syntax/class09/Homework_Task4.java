package com.syntax.class09;

public class Homework_Task4 {


	public static void main(String[] args) {

//		4. Print the following pattern:
//			55555
//			4444
//			333
//			22
//			1

		for (int i = 5; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		// Print the following pattern:
//			54321
//			4321
//			321
//			21
//			1
		for (int i = 5; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//1
		//21
		//321
		//4321
		//54321
		//4321
		//321
		//21
		//1
		
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
			for (int i = 4; i >= 1; i--) {

				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
	}
}
