package com.syntax.class18;

public class House {

public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Jessy";
		cat1.age = 8;
		cat1.color = "grey"; // accessing instance variable and assigning variables
		// to access static variables we use name of the class where they've been declared
		System.out.println("Number of paws is " + Cat.paws); // accessing static variable in a static way, no Object creation is required
		
		String color = "Yellow"; // declaring local variable
		
		Cat cat2 = new Cat();
		cat2.name = "Lucy";
		cat2.age = 1;
		cat2.color = "white";
		cat2.name = "Bonchuk";
		cat2.mustache = false; // it's gonna change everywhere, bc there could be only one copy of static value
		
//		System.out.println("The name of the 1st cat is " + cat1.name);
//		System.out.println("Age of cat " + cat1.age);
//		System.out.println("The name of the 2nd cat is " + cat2.name);
		
		System.out.println("Printing values of 1 cat -----");
		cat1.displayCat();
		cat1.displayCommonFeatures();
		System.out.println("Printing values of 2 cat -----");
		cat2.displayCat();
		cat2.displayCommonFeatures();
		
		Cat cat3 = new Cat();
		cat3.name = "Kathy";
		cat3.age = 4;
		cat3.color = "black";
		
		System.out.println("Printing values of 3 cat -----");
		cat3.displayCat();
		cat3.displayCommonFeatures();
	}

}

