package com.syntax.class20;

public class BetterCarTest {

	public static void main(String[] args) {
		
		BetterCar car = new BetterCar("X5", "Red", 2020, 80000);
			car.displayInfo();
			
			BetterCar car1 = new BetterCar("Modl S", "Pink", 2019, 900000);
			car1.displayInfo();
			
			//BetterCar(); CE: because we do not have a non argument constructor inside BetterCar class
		}

	}

