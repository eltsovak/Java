package com.syntax.class25;

public class Computer {


	String name, OS;
	int memory;
	
	public Computer(String name, String OS, int memory) {
	this.name = name;
	this.OS = OS;
	this.memory = memory;
	}
	
	public void displayInfo() {
		System.out.println("Computer " + name + " operates with " + OS + " OS and has " + memory + " Gbs of memory");
	}
	
	public void type() {
		System.out.println("You can type on " + name + " computer");
	}
	
	public void watchMovies() {
		System.out.println("You can watch movies on " + name + " computer");
	}

}

class Apple extends Computer{
	 Apple(String name, String OS, int memory) {
		 super(name, OS, memory);
	 }
	 
	 public void type() {
		 System.out.println("It's very easy to type on " + name + " computer");
	 }
}
class Lenovo extends Computer{
	
	Lenovo(String name, String OS, int memory) {
		super(name, OS, memory);
	}
	
	public void watchMovies() {
		System.out.println("I like to atch movies on " + name + " computer because it has a really good graphics");
	}
}

class HP extends Computer{
	
	HP(String name, String OS, int memory) {
		super(name, OS, memory);
	}
	public void type() {
		System.out.println("I type faster on HP computers");
	}
}
class Dell extends Computer{
	
	Dell(String name, String OS, int memory) {
		super(name, OS, memory);
	}
}

