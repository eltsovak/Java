package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {
	
	public static void main(String[] args) {
		
		String xFilePath = System.getProperty("user.dir") + "/testdata/SampleData.xlsx";
		
		try { // code that might throw an exception
			FileInputStream fis = new FileInputStream(xFilePath);
		
		}catch (FileNotFoundException fne) {// catching right exception
			
			System.out.println("I caught the exception");
			
		}
		
		
		int[] array = {10, 20, 30};
		
		try {
			System.out.println("I am the beggining of the try block");
			System.out.println(array[3]);
			System.out.println("I am the end of the try block");
			
		} catch (ArrayIndexOutOfBoundsException aiob) {
			
			System.out.println("I am the beggining of the catch block");
			System.out.println("I caught ArrayIndexOutOfBoundsException !");
			System.out.println("I am the end of the catch block");
		}
		
		System.out.println("End of the code");
		
	}

}
