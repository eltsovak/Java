package com.syntax.class19;

public class IPhone {

	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;
	
	String model;
	int memory;
	double price;
	String color;
	
	static void displayInfo() {// static works only with static
		System.out.println("iPhone belongs to brand " + brand + " and it has OS as " + OS + " and all iPhones have touchscreen = " + touchScreen);
	}
	
//	static void displayDetails() { // instance works with static and non static
//		System.out.println("We build iPhone " + model + " with memore = " + " in " + color + " color for the price =$" + price);
//	}
	
	// can instance method/non static method access static members?
	 void displayDetails() { // instance works with static and non static
		System.out.println("We build iPhone " + model + " with memore = " + " in " + color + " color for the price =$" + price);
	}
	
	public static void main(String[] args) {
		IPhone phone1 = new IPhone();
		phone1.model = "11 Pro";
		phone1.memory = 256;
		phone1.color = "Blue";
		phone1.price = 1000;
		phone1.displayDetails();
		//phone1.displayInfo();-- > possible but not preferable w/static method
		IPhone.displayInfo(); // calling static method
		
		
		IPhone.touchScreen = false; // the value will change everywhere
		
		System.out.println("------2 iPhone object----");
		IPhone phone2 = new IPhone();
		phone2.model = "11";
		phone2.memory = 64;
		phone2.color = "Pink";
		phone2.price = 900;
		phone2.displayDetails();
		IPhone.displayInfo();
		
		System.out.println("-----Calling info method again ------");
		IPhone.displayInfo();
		
	}

}

