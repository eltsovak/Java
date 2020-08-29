package com.syntax.class03;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int a = 7;
		int b = 10;
		
		System.out.println(a > b); //false
		System.out.println(3 > 4); // false
		System.out.println(a < b); //true
		System.out.println(a == b); // false
		System.out.println(a !=  b); //true
		
		System.out.println("__________________");
		double i = 10.78;
		double j = 10.55;
		boolean result1 = i > j; //is i greater than j? true
		System.out.println(result1);
		
		boolean result2 = i == j; //is i equal to j? false
		System.out.println(result2);
		
		boolean result3 = i != j; //is i different from j? true
		System.out.println(result3);
		
		double i1 = 10.78;
		double j1 = 10.78;
		boolean result11 = i1 > j1; //is i greater than j? false
		System.out.println(result11);
		
		boolean result22 = i1 == j1; //is i equal to j? true
		System.out.println(result22);
		
		boolean result33 = i1 != j1; //is i different from j? false
		System.out.println(result33);
		
		boolean result4 = i1>= j; //is i greater than or equal to j? true
		System.out.println(result4);
		
		boolean result5 = i1 <= j1; // is i smaller than or equal to j? true
		System.out.println(result5);
			
			
			
		}

}
