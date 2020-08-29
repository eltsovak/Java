package com.syntax.class27;

public class MotorcycleTest {

public static void main(String[] args) {
		
		//new Drivable(); CE: cannot instantiate
		//new Motorcycle(); CE:cannot instantiate
		
		System.out.println("----- Object of Motocycle type -----");
		
		Motorcycle m = new Bike();
		m.driving();
		m.breaking();
		m.operateVehicle();
		//Motorcycle.DRIVE = "not safe"; CE: cannot change the value of final variable
		System.out.println(Motorcycle.DRIVE);// static variable accessible through the class name
		
		System.out.println("----- Object of Drivable type -----");
		
		Drivable d = new Bike();
		d.driving();
		d.breaking();
		System.out.println(Drivable.DRIVE);
	}

}

