package com.syntax.class10;

public class TestRepl67 {

public static void main(String[] args) {
		
		for (int i=1; i <= 5; i++) {
			int num = i;
			for (int j = 1; j<=10; j++) {
				System.out.print(num + " ");
				num += i;
			}
			System.out.println();
		}
		
		
	}

}
