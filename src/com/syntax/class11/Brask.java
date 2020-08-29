package com.syntax.class11;

public class Brask {

	public static void main(String[] args) {

		String[] cars = { "BMW", "GMC", "Honda", "Ford", "Toyota", "Ford" };
		int size = cars.length;
		for (int i = 0; i < size; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();

		System.out.println("----Task 2 ------");

		int[] numbers = { 1, 45, 345, 23, 98, 56 };
//		int sum = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5]);
//		System.out.println("The sum of all elements is " + sum);

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("The sum of all elements is " + sum);

		System.out.println("----Using for loop-----");
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			total += num;
		}
		System.out.println("The sum of all elements is " + total);

		System.out.println("---task 3----");
		System.out.println("-----Elion's way, the fastest---");
		String[] countries = { "Belarus", "USA", "Russia", "Poland", "France" };

		String[] capitalCities = { "Minsk", "DC", "Moscow", "Warsaw", "Paris" };

		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			String city = capitalCities[i];
			System.out.println("The capital city of " + country + " is " + city);
		}

//		for (String country : countries) {
//			if (country.equals("Belarus")) {
//				System.out.println("Minsk");
//			} else if (country.contentEquals("USA") || country.contentEquals("US")) {
//				System.out.println("DC");
//			} else if (country.equals("Russia")) {
//				System.out.println("Moscow");
//			} else if (country.contentEquals("Poland")) {
//				System.out.println("Warsaw");
//			} else if (country.contentEquals("France")) {
//				System.out.println("Paris");
//			} else {
//				System.out.println("The country " + country + " is not in my list");
//			}
//
//			// 2nd way
//
//			for (int i = 0; i < countries.length; i++) {
//				switch (countries[i]) {
//				case "Belarus":
//					System.out.println("Minsk");
//					break;
//				case "USA":
//					System.out.println("DC");
//					break;
//				case "Russia":
//					System.out.println("Moscow");
//					break;
//				case "Poland":
//					System.out.println("Warsaw");
//					break;
//				case "France":
//					System.out.println("Paris");
//					break;
//				default:
//					System.out.println("The country is not in my list");
//				}
//			}
//
//		}
	}
}

