package com.syntax.class04;

import java.util.Scanner;

public class HomeworkLoan {
	
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Please, let us know what is the amount of loan needed?");
			
			int loan = scan.nextInt();
			if (loan >= 200000) {
				System.out.println("Cngratulations! Your loan is aproved");
			} else {
				System.out.println("Sorry, your loan has been rejected");
			}
			
		}

	}



