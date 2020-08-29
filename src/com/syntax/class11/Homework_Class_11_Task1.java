package com.syntax.class11;

public class Homework_Class_11_Task1 {

public static void main(String[] args) {
		
//		Create an array of cars : american, 
//		german, korean, italian. Then 
//		retrieve all values from that array 
//		using 2 different loops
		
		String cars[][] = {{"GMC", "Ford", "Chevrolet" }, {"BMW", "Opel", "Audi"}, {"KIA", "Hyundai", "Renault"}, {"Ferrari", "Maserati", "Alfa Romeo"}};
		
		
		
		for(int i =0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " , ");
			}
			System.out.println();
		}
		
		
		
	}

}

