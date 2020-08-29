package com.syntax.class07;

public class NewTaskWithWhileLoop {
	
	public static void main(String[] args) {

		// how to print numbers from 50 to 1 ?

		int num = 50;
		while (num >= 1) {
			System.out.println(num);
			num--;

			// how to print odd numbers from 1 to 20 ?
			//1st way, with +=2

			int num1 = 1;
			while (num1 <= 20) {

				System.out.println(num1);
				num1 += 2;
				
			}
			//2d way, with MOD
			int num2 = 1;
			while (num2 <= 20) {
				if (num2 % 2 == 1) {
					System.out.println(num2);
				}
			num2++;
			
			}
			
			//3rd way
			int z = 0;
			while(z<20) {
				z++;
				System.out.println(z);
				z++;
			}
			
//			Create a boolean variable workDay and assign true create int 
			//variable day and assign it to 1
//			●As long as it is workDay print “I need a day off” and increase day.
//			●Once day is 6 print “I do not need a day off any more”

		}		
		}
}
