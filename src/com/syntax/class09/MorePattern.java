package com.syntax.class09;

public class MorePattern {

	public static void main(String[] args) {
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		// how many rows? 4
		for (int i = 1; i <= 4; i++) {
			// how many columns? 5
			for (int j = 1; j <=5; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <=5; j++) {
			System.out.print(i);
		}
			//move to a next line
		System.out.println();
	}
		
	}
}

