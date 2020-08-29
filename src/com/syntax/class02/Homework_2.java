package com.syntax.class02;

public class Homework_2 {
	
public static void main(String[] args) {
		
		//Write a Java program to add, subtract, multiply and divide 2 decimal values.
		//Your program should say. 
		//"The _______ of 2 numbers ___ and ___ is equal to _____"
		
		double d1 = 3.5;
		double d2 = 6.65;
		
		double sum = d1 + d2;
		double sub = d1 - d2;
		double mult = d1 * d2;
		double div = d1/d2;
		
        String s1 = "addition";
        String s2 = "substraction";
        String s3 = "multiplication";
        String s4 = "division";
        
        System.out.println("The " + s1 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + sum);
        System.out.println("The " + s2 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + sub);
        System.out.println("The " + s3 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + mult);
        System.out.println("The " + s4 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + div);
        
        System.out.println("_______________");
        
        //Write a program to find the square of the number 3.9. 
        //You program should say "The square of the ____ is ____ "
        
        double number = 3.9;
        double square = number * number;
        System.out.println("The square of the " + number + " is " + square);
        System.out.println("_______________");
        
        //Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
        //Your program should say. 
        //"The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"

        int w = 5;
        int h = 8;
        int sum1 = w + h;
        int perimeter = sum1*2;
        int area = w*h;
        System.out.println("The perimeter of a rectangle wit width " + w + " and height " + h + " is equal to " + perimeter + " and the area is " + area);
        
	}


}
