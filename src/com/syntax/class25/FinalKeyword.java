package com.syntax.class25;

public class FinalKeyword {

	//public final class FinalKeyword { --> prevents inheritance, CAN NOT have child classes
		// FINAL CLASSES CANNOT BE EXTENDED
		
		public static String str = "Hello";
		
		public static final String USERNAME= "Admin"; // final variables must be initialized
		
		public final String PASSWORD = "Admin123";
		
		
		public static void main(String[] args) {
			
			System.out.println(str);
			str = "hi";
			System.out.println(str);
			
			System.out.println(USERNAME);
			//username = "User123"; CE: FINAL variables are CONSTANT, they can not be changed
			
			FinalKeyword fk = new FinalKeyword();
			//fk.PASSWORD = "user123"; CE: variable is final
			System.out.println(fk.PASSWORD);
		
		}
		
		public final void hello() {
			System.out.println("Last hello of today");
		}

	}
	class FinalBaby extends FinalKeyword{
		
		//FINAL METHODS CAN NOT BE OVERRIDEN
		
//		public void hello() { CE
//			System.out.println("Sorry, it's not the last hello");
//		}
	}
