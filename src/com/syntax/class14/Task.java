package com.syntax.class14;

import java.util.Scanner;

public class Task {


//		  Accept username, password and confirm password from a user and check following requirements:
	//
//			  Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//			  Password should be minimum 8 characters, if less → message=“Password is too short”.
//			  Password cannot contain username if so, → message=“Password cannot contain username”.
//			  Password should match confirmed password, if not  → message=“Passwords do not match”.
	//
//			  Only after all requirements met → message “Your username and password has been created”
	//
//	     better to use NESTED IF bc if one condition fails - it doesn't check for the rest
//			  

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Please, enter your username");
			String username = scan.nextLine();

			System.out.println("Please, enter your password");
			String password = scan.nextLine();

			if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Username or Password cannot be empty");
			} else {

				if (password.length() >= 8) {

					if (!password.contains(username)) {

						System.out.println("Please, confirm your password");
						String passwordConfirmation = scan.nextLine();

						if (password.equals(passwordConfirmation)) {
							System.out.println("Your username and password has been created");
						} else {
							System.out.println("Passwords do not match");
						}

					} else {
						System.out.println("Password cannot contain username");
					}

				} else {
					System.out.println("Password is too short");
				}

			} // HW continue asking user for username & password until all requirements are met 
			//and credentials are created
		}
	}

