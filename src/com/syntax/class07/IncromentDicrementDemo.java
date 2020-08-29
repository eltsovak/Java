package com.syntax.class07;

public class IncromentDicrementDemo {
	
public static void main(String[] args) {
		
		int x = 10;
		x = x + 1;
		x += 1;
		// another way to add 1 into the VARIABLE
		x++; // post-increment
		++x; // pre-increment
		
		System.out.println(x);
		
		int y = 50;  // pre-increment
		y = y - 1;
		y -= 1; // substract 1 from Y, short way
		y--;
		
		System.out.println(y);
		
		//3++; //compiler error
		//3--; // compiler error
		
		int z = 5;
		// System.out.println(z++);
		if (++z == 6) {
			System.out.println("Hi there!");
		}
		
		System.out.println(z);

		int k = 10; // post-increment
		if (k++ == 11) {
			System.out.println("Neil was here");
		}
		 // What is if I want to increase by 2?
		int m =5;
		// m + 2; // compiler error
		m += 2; // the only way
		
		int time = 10;
		
		if (time > 12) {
			System.out.println("Good morning!");
		}
		
		System.out.println("------While Loop-----");
		 // This code will execute infinitely.
		// But then we fixed it by adding time ++
		while (time < 12) {
			System.out.println("Good morning!");
			time++;
		}
		
		// while (time > 12) {   ---> this code will NOT execute
		// This block of code will never execute
//		System.out.println("Hello!");
		// time--;
//		}
		
		
		int hi = 5;
		while (hi < 10) {
		
			System.out.println("Hi");
			hi++;
			
		}
		
		boolean isRain = true;
		
		if (isRain) {
			System.out.println("Take your umbrealla"); // 1 time
		}
//		 while (isRain) {
//			 System.out.println("Take your umbrealla"); // infinitely
//		 }
		 System.out.println("------while isRain------");
		
		while (isRain) {
			System.out.println("Take your umbrealla");
			//isRain ++; //compiler error
			isRain = false;
			
			System.out.println("---------------");
			//how to print number from 1 to 50?
			
			int num = 1;
			while (num <= 50) {
				System.out.println(num);
				num++;
			}
			
			// how to print numbers from 20 to 30?
			
			int num1 = 20;
			while (num1 <= 30) {
				System.out.println(num1);
				num1++;
			}
			// how to print numbers from 5 to 15 at the same line?
			
				int num2 = 5;
				while (num2 <= 15) {
				System.out.print(num2 + " ");
				num2++;
		}
				System.out.println();
				System.out.println("-------------");
				
				// how to print numbers from 5 to 15 at the same line?
				
				int num3 = 10;
				while (num3 >= 1) {
				System.out.println(num3);
				num3--;
	}
		}
		
		

	}
}

