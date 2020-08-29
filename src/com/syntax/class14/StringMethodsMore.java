package com.syntax.class14;

public class StringMethodsMore {

public static void main(String[] args) {
		
		System.out.println("-------.charAt () method----");
		
		String season = "Summer";
		char character = season.charAt(1);
		System.out.println(character);
		
		System.out.println("-------.indexOf () method----");
		
		int index = season.indexOf('S');
		System.out.println(index);
		
		String hello = "Hello Ksenia";
		int indexOfKsenia = hello.indexOf("Ksenia");
		System.out.println("Index of Ksenia in the String "+ hello + " is " + indexOfKsenia);
		
		System.out.println("-------.substring () method----");
		
		String message = "You guys are awesome";
		String substring = message.substring(4); // take string starting from index 4
		System.out.println(substring);
		
		String newMessage = message;
		System.out.println(newMessage);
		
		String middleWord = message.substring(4, 8);
		System.out.println(middleWord);
		
		
	}

}

