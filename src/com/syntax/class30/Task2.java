package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	
	public static void main(String[] args) {
	
//		Create an arrayList of words. Remove every word that ends with “e”.
		
		ArrayList<String> words = new ArrayList<>();
		words.add("tithe");
		words.add("love");
		words.add("cove");
		words.add("happiness");
		words.add("Java");
		
		Iterator<String> wordsIt = words.iterator();
		while(wordsIt.hasNext()) {
			String word = wordsIt.next();
			if(word.endsWith("e")) {
				wordsIt.remove();
			}
	}
		System.out.println(words);
		
	}

}
