package com.syntax.class27;

public interface Drivable {// interface is a collection of public abstract methods and public static final variables
	
	public static final String DRIVE = "Drive safe";
	
	// int maxSpeed; --> cannot have instance variables bc compiler adds PSF(public static final)
	
	void driving(); // by default compiler adds public abstract to methods
	
	void breaking();
}
// we can extend ONLY 1 class but we can implement MULTIPLE interfaces
abstract class Motorcycle extends Vehicle implements Drivable {
	
	public void driving() {
		System.out.println("Motorcycle is driving");
	}
}
class Bike extends Motorcycle{
	
	public void breaking() {
		System.out.println("Bikes can break");
	}
}
class Vehicle{
	
	public void operateVehicle() {
		System.out.println("To operate any vehicle we need to have driver lisence");
	}
}
