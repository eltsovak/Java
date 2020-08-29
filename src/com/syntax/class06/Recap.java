package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {

		// If hour is between 1 - 11 --> morning
		// If hour is between 12 - 15 --> afternoon
		// If hour is between 16 - 20 --> evening
		// If hour is between 21 - 24 --> night
		// We will print right: Right now is _____

		int hour = 9;
		// String dayTime;

		if (hour >= 1 && hour <= 11) {
			// dayTime = "morning";
			System.out.println("Right now is morning");
		} else if (hour >= 2 && hour <= 15) {
			// dayTime = "afternoon";
			System.out.println("Right now is afternoon");
		} else if (hour >= 16 && hour <= 20) {
			// dayTime = "evening";
			System.out.println("Right now is evening");
		} else if (hour >= 21 && hour <= 24) {
			// dayTime = "night";
			System.out.println("Right now is night");
		} else {
			// dayTime = "unknown";
			System.out.println("Unknown");
		}
//		if (dayTime.equals("Unknown")) {
//			
//		} else {
//			System.out.println("Right now is night");
//		}
		// System.out.println("Right now is " + dayTime);
	}

}
