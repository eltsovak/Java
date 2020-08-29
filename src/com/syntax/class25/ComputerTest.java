package com.syntax.class25;

public class ComputerTest {

public static void main(String[] args) {
		
		Computer[] computers = {new Apple("Apple", "iOS", 16), new Lenovo("Lenovo", "Windows", 8), new HP("HP", "Windows", 16), new Dell("Dell", "Windows", 8)};
		for(Computer comp: computers) {
			comp.displayInfo();
			comp.type();
			comp.watchMovies();
			System.out.println("----");
		}
	}

}

