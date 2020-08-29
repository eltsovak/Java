package com.syntax.class10;

public class ArrayAnotherWay {

public static void main(String[] args) {
		
		// We created an array and stored the initial values
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday"};
		
		// Let us print the element with index 3
		System.out.println(weekdays[3]);
		// if we misspelled - re-assign
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		
		// we can not add more elements to the array --> runntime error
		
		//1st way
		double[] balances = {100000, 23.50, 5540.5};
		System.out.println("total money is " + (balances[0] + balances[1] + balances[2]));
		
		// 2nd way
		int total = (int) balances[0] + (int) balances[1] + (int) balances[2];
		System.out.println("total money is: " + total);
		
		//3rd way --> we don't lose 1$ bc first it multiple as doubles-> converts to int
		int total2 = (int) (balances[0] + balances[1] + balances[2]);
		System.out.println("total money is: " + total2);
		
		
		//don't ever create an array with 0 elements
		//bc you can not add elements later
		int[] numbers1 = new int[0];
		
		int[] numbers2 = {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
		
	}

}

