package com.syntax.class25;

public class TestClass {

public static void main(String[] args) {
		
		SuperClass c = new SubClass();
		c.enjoy(); // will execute parent's method, bc can not override static
		//static method from parent class will get executed, enjoy from child class will be hidden
		
		SuperClass.enjoy();
		SubClass.enjoy(); // can not see parent static method, only its own static method
	}

}

