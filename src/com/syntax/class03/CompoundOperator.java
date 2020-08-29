package com.syntax.class03;

public class CompoundOperator {

	public static void main(String[] args) {
		int num = 100;
		num =  num + 100; //200
		System.out.println(num);
		
		num = num + 100; //300
		System.out.println(num);
		
		// We can use compound operators, which are shorter
		num += 100;
		System.out.println(num);
		
		// long way
		//num = num - 50;
		
		//short way
		num -= 50;
		System.out.println(num);
		
		num /= 7;
		System.out.println(num); //50
		
		//long way
		//num = num * 2;
		
		num *= 2;
		System.out.println(num); // 100
		
		//num = num % 9;
		
		num %= 9;
		System.out.println(num);
		
		System.out.println("_______________");
		
		int n1 = 10;
		n1 += 100;
		System.out.println(n1);
		
		int n2 = 603;
		n2 -= 67;
		System.out.println(n2);
		
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);
		
		int cakePiece1 = 25;
		cakePiece1 %= 7;
		System.out.println(cakePiece1);
		
		
	}

}
