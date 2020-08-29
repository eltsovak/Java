package com.syntax.class04;

import java.util.Scanner;

public class HomeworkDmv {
	
public static void main(String[] args) {
		
		//You are DMV representative and you need to
		//ask customer their age. If they are 18 and older
		//you will issue a driver licence to them,
		//otherwise you will offer them to get a learners permit.
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("Please, enter your age");
		
		int age = myScanner.nextInt ();
		if (age >=18) {
			System.out.println("Congratulations! Your driver license has been issued");
		} else {
			System.out.println("Sorry, we couldn't issue your driver license at this time. You can try to apply for a learner permit");
		}
		
	}

}



