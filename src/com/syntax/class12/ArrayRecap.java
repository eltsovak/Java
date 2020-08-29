package com.syntax.class12;

public class ArrayRecap {

public static void main(String[] args) {
		
		String[] colors = new String[3];
		
		colors[0] = "blue";
		colors[1] = "yellow";
		colors[2] = "red";
		
		System.out.println(colors.length);
		
		// regular for loop
		
		String color = null;
		for(int b = 0; b < colors.length; b++) {
			color = colors[b];
			
		}
		
		System.out.println(color); // out of the loop, gonna print only red, which is the last value
		
		// advanced for loop
		
		for(String c:colors) {
			System.out.println(c); // gonna print all the colors
		}
		
		
	}

}

