package com.syntax.class15;

public class SplitFunction {

public static void main(String[] args) {
		
		String str = "Today is Sunday and we have a Java class";
		
		String[] array = str.toLowerCase().split("s"); // Java --> output 2 elements (one before Java and one after)
		
		int howManyElements = array.length;
		System.out.println(howManyElements); // 4
		
		// using enhaned for loop
		for (String s:array) {
			System.out.print(s + "|");
		}
		
	}

}

