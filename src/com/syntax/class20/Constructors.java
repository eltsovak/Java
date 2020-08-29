package com.syntax.class20;

public class Constructors {


	String word;

	public Constructors() {
		System.out.println("I am a non argument construcor");
	}

	public Constructors(String word) {
		this(12, word);// IF YOU NEED TO MAKE A CALL -> ALWAYS MUST BE A 1ST STATEMENET INSIDE THE
						// CONSTRUCTOR
		this.word = word;
		System.out.println("I am a parameterized constructor with str = " + word);
		// this(); CE: MUST BE THE FIRST LINE
	}

	public Constructors(int num) {
		System.out.println("I am a non argument with 1 patameter = " + num);
	}

	public Constructors(int num, String word) {
		System.out.println("I am a non argument 2 parameters = " + num + " and " + word);
	}
//	public Constructors(String str) { CE: wee can not have duplicate constructor
//		System.out.println("I am a non argument with 1 parameter = " + num);
//	}

	public static void main(String[] args) {

		Constructors obj = new Constructors("Java");
		System.out.println(obj.word);

	}

}

