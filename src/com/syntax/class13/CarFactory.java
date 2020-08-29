package com.syntax.class13;

public class CarFactory {


	public static void main(String[] args) {
		
		// building an object of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of the first car is " + car1.make + " and model is " 
				+ car1.model + " and it is in a " + car1.color + " color");
		
		
		System.out.println("----Accessing methods from Car class using car1----");
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		car1.stop();
		
		// building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of the second car is " + car2.make + " and model is " 
				+ car2.model + " and it is in a " + car2.color + " color");
		
		System.out.println("----Accessing methods from Car class using car2----");
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		car2.stop();
		
		
		Car car3 = new Car();
		car3.make = "Ford";
		car3.model = "Fiesta";
		car3.color = "Yellow";
		car3.year = 2016;
		car3.speed = 170;
		System.out.println("Make of the third car is " + car3.make + " and model is " 
				+ car3.model + " and it is in a " + car3.color + " color");
		
		System.out.println("----Accessing methods from Car class using car3----");
		car3.drive();
		car3.reverse();
		car3.transportPeople();
		car3.stop();
		
		Car car4 = new Car();
		car4.make = "Porcshe";
		car4.model = "Cayenne";
		car4.color = "Silver";
		car4.year = 2017;
		car4.speed = 190;
		System.out.println("Make of the fourth car is " + car4.make + " and model is " 
				+ car4.model + " and it is in a " + car4.color + " color");
		
		System.out.println("----Accessing methods from Car class using car4----");
		car4.drive();
		car4.reverse();
		car4.transportPeople();
		car4.stop();
		
		
		//new Bus(); compiler will give an error 
		//because we never created a Bus class
		
	}

}
