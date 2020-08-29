package com.syntax.class26;

public class Car1Test {

public static void main(String[] args) {
	    
	    Car1 car1 = new Car1("Toyota", "Prius", 4, 120, 30000);
	    car1.displayInfo();
	    
	    Car1 car2 = new Car1("Toyota", "Prius", 120, 30000);
	    car2.displayInfo();
	    
	    Car1 car3 = new Car1(4, 120, 30000);
	    car3.displayInfo();
	    
	    Car1 car4 = new Car1("Toyota", "Prius", 4);
	    car4.displayInfo();
	   
	  }


}

