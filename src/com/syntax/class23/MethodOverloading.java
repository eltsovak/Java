package com.syntax.class23;

public class MethodOverloading {

	//1. by changing numbers of parameters
	
		public int sum(int num1, int num2) { // method signature = name and parameters
			return num1 + num2;
		}
		
//		CE: public void sum(int num1, int num2) {
//			
//		} --> not gonna work,we cannot overload method by changing a return type ONLY
		
		public int sum(int num1, int num2, int num3) {
			return num1 + num2 + num3;
			
		}
		
		//2. by changing type of the parameters
		
		public double sum(double num1, double num2) {
			return num1 + num2;
		}
		
		public double sum(double num1, double num2, double num3) {
			return num1 + num2 + num3;
		}

	}

