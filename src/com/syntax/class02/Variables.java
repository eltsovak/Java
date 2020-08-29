package com.syntax.class02;

public class Variables {
	
	public static void main(String[] args) {
		//Create a Java program and name it Variables
				/*)In your program create different type of variables to store student’s information and then print value of those variables:
					*name
					*lastName
					grade
					*city
					*state
					*phoneNumber
					b)  Change student’s city, state, phone number and grade. And print those updated values.		
		*/
				
			String name = "Ksenia";
			String lastName = "Yeltsova";
			String grade = "24";
			String city = "Brooklyn";
			String state = "New York";
			String phoneNumber = "347-705-4370";
			//or
			long phoneNumber2 = 13477054370l;
			
			
			System.out.println(name);
			System.out.println(lastName);
			System.out.println(grade);
			System.out.println(city);
			System.out.println(state);
			System.out.println(phoneNumber);
			System.out.println(phoneNumber2);
			
			//Not possible
			//String city = "Garfield";
			
			//Not good, because you're not re-assigning
			//String city2 = "Garfield";
			
			name = "Ksu";
			lastName = "___";
			grade = "25";
			city = "NYC";
			state = "NY";
			phoneNumber = "343432887";
			
			System.out.println(name);
			System.out.println(lastName);
			System.out.println(grade);
			System.out.println(city);
			System.out.println(state);
			System.out.println(phoneNumber);
			
		
			}

}
