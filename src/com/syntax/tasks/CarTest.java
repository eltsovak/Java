package com.syntax.tasks;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Sedan(50000, "red", 10);
		System.out.println(car1.calculateSalePrice());
		
		Car car2 = new Truck(45000, "pink", 25);
		System.out.println(car2.calculateSalePrice());
	
	}
	

}
