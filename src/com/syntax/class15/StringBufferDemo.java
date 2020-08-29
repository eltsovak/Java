package com.syntax.class15;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer strBuffer = new StringBuffer("Hello"); // class - sequence of characters
		strBuffer.append(" friends"); // when we perform operation it happens on same Object and NO NEW Object gets created
		
		System.out.println(strBuffer); // Hello friends
		
		String str2 = "Hello"; // String is Immutable object = not changeble
		
		str2.concat( " friends"); // new Object

	}

}
