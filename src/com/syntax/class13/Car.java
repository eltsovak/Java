package com.syntax.class13;

public class Car {
	// define car features in a form of variables

		String make;
		String model;
		String color;
		int year;
		int speed;

		public static void main(String[] args) {
			System.out.println("Hello, I am a code from main nethod");

			Car c1 = new Car();
			c1.make = "Toyota";
			c1.model = "Camry";
			c1.color = "Yellow";
			c1.year = 2020;
			c1.speed = 180;
			
			// calling method drive
			c1.drive();
			//calling method reverse
			c1.reverse();
			//calling method transoprtPeople
			c1.transportPeople();
			//calling method stop
			c1.stop();
			
			

		}

		// define behavior in a form of methods

		void drive() {
			System.out.println(make + " car can drive");
		}

		void reverse() {
			System.out.println(make + " car can reverse");
		}

		void transportPeople() {
			System.out.println(make + " car can transport people");
		}
		void stop() {
			System.out.println(make + " car will stop when press break");
			System.out.println(make + " car will stop");
		}

	}
