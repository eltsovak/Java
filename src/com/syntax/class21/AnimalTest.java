package com.syntax.class21;

public class AnimalTest {

public static void main(String[] args) {
		
		// object of a parent class has an access to all variables of its class only
		Animal a = new Animal();
		a.breed = "Somethig";
		a.color = "grey";
		a.paws = 4;
		
		a.sleep();
		a.eat();
		
		// object of a child class has an access to all variables of its class and of parent's clss
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "Black and White";
		dog.paws = 4;
		dog.tail = true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed = "British";
		cat.color = "Grey";
		cat.paws = 4;
		cat.tail = true;
		cat.fur = "Long";
		
		cat.purr();
		cat.eat();
		cat.sleep();
		
		
	
		
		
		
	}

}

