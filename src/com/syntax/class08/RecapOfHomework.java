package com.syntax.class08;

public class RecapOfHomework {

	public static void main(String[] args) {

		// print number from 100 to 1

		for (int start = 100; start >= 1; start--) {
			System.out.println(start);
		}
		// print numbers 1,2,3
		for (int i = 1; i <=3; i++) {
			System.out.print(i + ",");
		}
		
		System.out.println("---print numbers between 20 and 50 (1st way)---");
		
		for (int k = 20; k <= 50; k++) {
			if (k % 2 == 1) { // (k%2!=0) // it's an odd number
			System.out.println(k);
			
			}
		}
		System.out.println("---print numbers between 20 and 50 (2nd way)---");
		
		for (int p = 21; p <= 50; p+=2) {
			System.out.println(p);
		}
		
		System.out.println("---print numbers between 5 and 1---");
		
		for (int o = 5; o >= 1; o--) {
			System.out.println(o);
			
			System.out.println("--what is the  result---");
			
			int total = 1;
			for (int q = 1; q <= 4; q++) {
				total = total + q;
			}
			System.out.println(total);
		}
	}

}
