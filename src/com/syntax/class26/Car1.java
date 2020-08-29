package com.syntax.class26;

class Car1 {

	String make, model;
	int numberOfDoors, topSpeed;
	double price;

	public void displayInfo() {
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	Car1(String make, String model, int numberOfDoors, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;

	}

	Car1(String make, String model, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		numberOfDoors = 4;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Car1(int numberOfDoors, int topSpeed, double price) {
		this.make = make;
		make = "unknown";
		this.model = model;
		model = "unknown";
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Car1(String make, String model, int numberOfDoors) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		topSpeed = 90;
		this.price = price;
		price = 0;
	}

}
