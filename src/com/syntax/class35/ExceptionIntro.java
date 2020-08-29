package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String xFilePath = System.getProperty("user.dir") + "/testdata/SampleData.xlsx";
		//FileInputStream fis = new FileInputStream(xFilePath); // will get FileNotFoundException
		
		int a = 10;
		int b = 0;
		
		System.out.println(a/b);// will get ArithmeticException if 0
		
		
		int[] arr = {100, 200};	
		
		System.out.println(arr[2]); // will get ArrayIndexOutOfBoundsException
		
		
//		ArithmeticException ae = new ArithmeticException();
//		throw ae; --> that's what happens
		
		
		
		System.out.println("End of the code");
		
	}

}
