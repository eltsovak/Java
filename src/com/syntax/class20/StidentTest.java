package com.syntax.class20;

public class StidentTest {

	public static void main(String[] args) {
		
		Students std1 = new Students("Ksenia", 100, 89, 98);
		Students std2 = new Students("Nicole", 98, 80, 88);
		Students std3 = new Students("Gloria", 90, 84, 56);
		Students std4 = new Students("Olga", 88, 84, 52);
		Students std5 = new Students("Rory", 78, 83, 89);
		
		System.out.println(std1.calculateAverage());
		System.out.println(std2.calculateAverage());
		System.out.println(std3.calculateAverage());
		System.out.println(std4.calculateAverage());
		System.out.println(std5.calculateAverage());
		
		
		}
		
	}

