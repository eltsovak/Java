package com.syntax.class07;

public class Task2 {

public static void main(String[] args) {
		
//		Create a boolean variable workDay and assign true create int variable day and assign it to 1
//		●As long as it is workDay print “I need a day off” and increase day.
//		●Once day is 6 print “I do not need a day off any more”
		
		//1st way
		
		boolean  workDay = true;
		int day = 1;
		
		while (day < 6) {
			System.out.println("I need a day off");
			day++;
		}

			System.out.println("I don't need a day off any more");
			
			
			
			// 2nd way
			
			boolean workDay1 = true;
			int day1 = 1;
			
			while (workDay1) {
				if (day1 < 6) {
					System.out.println("I need a day off");
					day1++;
				} else {
				System.out.println("I do not need a day off any more");
				workDay1 = false;
			}
				
			}
				
				//2nd way
			boolean workDay2 = true;
			int day2 = 1;
			
			while (workDay2 && day2 <= 6) {
				if (day2 < 6) {
					System.out.println("I need a day off");
					day2++;
				} else {
				System.out.println("I do not need a day off any more");
				day2++;
			
	
			
			
		}	
		
			}
	}


}
