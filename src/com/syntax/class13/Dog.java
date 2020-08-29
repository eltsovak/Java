package com.syntax.class13;

public class Dog {

//	Create a Dog Class and create 3 different objects of it: 
//	Husky, Bulldog, Labrador  with specific  attributes and behaviors.

String breedOfDog;
String nameOfDog;
String ownerOfDog;
String colorOfDog;
int yearsOfDog;

void bark() {
	System.out.println(breedOfDog + " can bark");
}
void play() {
	System.out.println(breedOfDog + " can play");
}
void commands() {
	System.out.println(breedOfDog + " can do different commands");
}

public static void main(String[] args) {
	
	Dog dog1 = new Dog();
	dog1.breedOfDog = "Husky";
	dog1.nameOfDog = "Cleo";
	dog1.ownerOfDog = "Michael and Michel";
	dog1.colorOfDog = "Black and White";
	dog1.yearsOfDog = 3;
	
	System.out.println("The dog's breed is " + dog1.breedOfDog + " , it's name is " +
			dog1.nameOfDog + " , it's owners are " + dog1.ownerOfDog + " . The dog is " + dog1.yearsOfDog + " years old, it's color is " +
					dog1.colorOfDog);
	
	dog1.bark();
	dog1.play();
	dog1.commands();
	
	
	
	System.out.println("-----");
	
	Dog dog2 = new Dog();
	dog2.breedOfDog = "Bulldog";
	dog2.nameOfDog = "Ryan";
	dog2.ownerOfDog = "Robert and Lucy";
	dog2.colorOfDog = "Red";
	dog2.yearsOfDog = 5;
	
	System.out.println("The dog's breed is " + dog2.breedOfDog + " , it's name is " +
			dog2.nameOfDog + " , it's owners are " + dog2.ownerOfDog + " . The dog is " + dog2.yearsOfDog + " years old, it's color is " +
					dog2.colorOfDog);
	
	dog2.bark();
	dog2.play();
	dog2.commands();
	
	
	
System.out.println("-----");
	
	Dog dog3 = new Dog();
	dog3.breedOfDog = "Labrador";
	dog3.nameOfDog = "Jenny";
	dog3.ownerOfDog = "Kate and Leah";
	dog3.colorOfDog = "Golden";
	dog3.yearsOfDog = 2;
	
	System.out.println("The dog's breed is " + dog3.breedOfDog + " , it's name is " +
			dog3.nameOfDog + " , it's owners are " + dog3.ownerOfDog + " . The dog is " + dog3.yearsOfDog + " years old, it's color is " +
					dog3.colorOfDog);
			
	
	dog3.bark();
	dog3.play();
	dog3.commands();
	
	
	
	
	
}

}
