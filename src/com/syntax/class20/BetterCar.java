package com.syntax.class20;

public class BetterCar {


	public static String make;
	protected String model, color;
	int year, door, speed;
	private double price;
	
	public void displayInfo() {
		System.out.println("We build a " + color + " " + year + " " + make + " " + model + " for price = $" + price);
	}
	
	BetterCar(String carModel, String carColor, int carYear, double carPrice) { // local variables to the constractor
		model = carModel;
		color = carColor;
		year = carYear;
		price = carPrice;
		
	}

}

