package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
	     // widening, implicit casting, automatically
		//double d = (double) 7; you can put double, but can skip it in this case
		double d = 7;
		System.out.println(d);
		
		// int i = 7.58; // compile time error -> Type mismatch: cannot convert from double to int
		// doubl to int
		
		//narrowing (explicit casting, manually)
		int i = (int) 7.58;
		
	
		byte b = 123;
		System.out.println(b);
		
		//narrowing a large number into a byte
		// explicitly doing it, manually
		byte b1 = (byte) 123865;
		System.out.println(b1);
		
		
		//narrowing/explicitly/manually
		// You are trying to fit something from a big box into a small
		
		long l1 = 45;
		long l2 = 1567582676575285l;
		
		int number1 = (int) l1;
		System.out.println("number1 = " + number1);
		
		int number2 = (int) l2; //0111011 (positive number starts from 0), 11011101(negative number starts from 1) <- these are 2 bites
		System.out.println("number2 = " + number2);
		
		int num = (int) l2;
		System.out.println(num);
		
		System.out.println("___________");
		
		
	}


}
