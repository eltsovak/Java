package com.syntax.class25;

public class Store {

String name, location;
	
	public Store(String name, String location){
		
		this.name = name;
		this.location = location;
	}
	
	public void openHours() {
		System.out.println(name + " is open from 8 AM - 8 PM");
	}
	
	public void sell() {
		System.out.println("Stores sell items");
	}
	
}

class Macys extends Store{
	public Macys(String name, String location) {
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name + " is open from 8 AM - 12 AM");
	}
}

class Starbucks extends Store{
	
	Starbucks(String name, String location){
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name + " is open everyday from 6 AM till 8 PM");
	}
	 public void sellDrinks() {
		 System.out.println(name + " sells different types of drinks");
	 }
	
}
class Nike extends Store{
	
	String shoes;
	
	Nike(String name, String location, String shoes) {
		super(name, location);
		this.shoes = shoes;
	}
	
	
}
