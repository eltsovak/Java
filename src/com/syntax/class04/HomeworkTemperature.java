package com.syntax.class04;

import java.util.Scanner;

public class HomeworkTemperature {
	
public static void main(String[] args) {
		
		//Create a Java program that will ask user to
		//input city and temperature. Your program
		//should convert Fahrenheit into celsius and
		//print “The temperature is the city __ is __”
		
		Scanner scann = new Scanner (System.in);
		System.out.println("Please, enter your city");
		String city = scann.next();
		System.out.println("Please, enter the temperature in your city in Fahrenheit");
		double tempF = scann.nextDouble();
		System.out.println("The temperature in the city " + city + " is " + (tempF - 32) * 5 / 9 );
		
		
	}
	
}


