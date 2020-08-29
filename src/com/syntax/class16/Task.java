package com.syntax.class16;

public class Task {


	//Create a method that will take 2 parameters 
	//as a numbers and prints which number is larger.
	
	void isLarger (int num1 , int num2) {
		
		if (num1 > num2) {
			System.out.println("The larger number is: " + num1);
		} else {
			System.out.println("The larger numver is: " + num2);
		}
	}


	
	//Create a method that will 
	//take a number and prints whether the number is even or odd.
	
	void oddOrEven (int num) {
		
		if (num %2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}
	
	//Create a method that will print whether 
	//given String is palindrome or not.
	
	void palindrome(String word) {
		String b = "";
		
		for(int i = word.length() - 1; i>= 0; i--) {
			b += word.charAt(i);
		}
		
		if(b.equals(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not palindrome");
		}
	}
//	Create a method that will say Hello in different language 
//	based on the country that will passed when method is executed.
	
	void sayHello (String country) {
		
		country = country.toLowerCase();
		
		switch(country) {
		case "usa":
			System.out.println("Hello");
			break;
		case "turkey":
			System.out.println("Merhada");
			break;
		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;
		default:
			System.out.println("Hi");
		}
	}
}

