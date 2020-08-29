package com.syntax.class15;

public class Task {

public static void main(String[] args) {
		
//		Create a String that will hold a sentence. 
//		Write a program to get a new String without any spaces.
		
		String sentence = "Java comes to my dreams";
		String newSentence = sentence.replaceAll("[^A-Za-z]", "");
		System.out.println(newSentence);
		
		System.out.println("----");
		
//		Create a String that should be combination of letters, numbers 
		//and special characters.
//		Find out how many alpha characters are there in the String.
		
		// one of th interview questions
		String combination = "HelloHi5675835@%";
		String newCombination = combination.replaceAll("[^A-Za-z]", "");
		
		int newCombinationSize = newCombination.length();
		//System.out.println(new.Combination.length());
		System.out.println(newCombinationSize);
		
//		You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
//				How would you find out how many sentences are in that String?
		
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = str.split("[.!?]");
		int size = array.length;
		System.out.println(size);
		}
		
	}



