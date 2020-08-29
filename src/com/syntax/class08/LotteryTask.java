package com.syntax.class08;

import java.util.Scanner;

public class LotteryTask {

//	We are playing a lottery game and the lucky number is 17; 
	//We want to keep asking the user to enter any numbers from 1-20; 
	//until he guesses the lucky number --> In that case we print "Congrats, you won!"
//	You can try to solve it with do-while or while, whichever is the best choice...
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int lucky = 17;
		int num;
		// if i use while loop, I have to ask 2 times; 
		//if i use do while loop, I have to ask only 1 time
		do {
	
		System.out.println("Please, enter a number from 1 to 20");
		 num = scan.nextInt();
		} while (num != lucky);
		
		
		if (num == lucky) {
			System.out.println("Congrats, you won!");
			
		}
		
		
	}

}
