package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	
	public static void main(String[] args) {
		
//		Create an arraylist of cars and retrieve all the values using 3 different ways.
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Honda");
		cars.add("Audi");
		cars.add("Lamborgini");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Chevi");
		
		System.out.println("---Removing Objects from ArrayList using regular loop ---");
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).equals("BMW")) {
				cars.remove(i);
			}
		}
		System.out.println("ArrayList after modigfications == " + cars);
		
		System.out.println("---Removing Objects from ArrayList using iterator ---");
		
		Iterator<String> carsIt = cars.iterator();
		while(carsIt.hasNext()) {
			if(carsIt.next().equals("Chevi")) {
				carsIt.remove();
			}
		}
		System.out.println("ArrayList after modigfications 2 == " + cars);
		
		Iterator<String> carsIt2 = cars.iterator();
		while(carsIt2.hasNext()) {
			String car = carsIt2.next();
			if(car.equals("Audi") || car.equals("Ford")) {
				carsIt2.remove();
			}
	}
		System.out.println("ArrayList after modigfications 3 == " + cars);
		
		
}
}
