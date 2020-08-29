package com.syntax.class11;

public class TwoDimentialArray {


	public static void main(String[] args) {

		int[][] numbers = new int[3][4]; // [rows], [columns]
		// 1st row, with index 0
		numbers[0][0] = 10; // putting a value in the first row, first column
		numbers[0][1] = 15; // putting a value in the first row, second column
		numbers[0][2] = 20;
		numbers[0][3] = 25;

		// 2nd row, with index 1

		numbers[1][0] = 32; // putting a value in the second row, first column
		numbers[1][1] = 36; // putting a value in the second row, second column
		numbers[1][2] = 40;
		numbers[1][3] = 44;
		// numbers[1][4] --> runtime error, OutOfBounds Exception

		// 3rd row, with index 2

		numbers[2][0] = 63; // putting a value in the third row, first column
		numbers[2][1] = 66; // putting a value in the third row, second column
		numbers[2][2] = 69;
		numbers[2][3] = 72;

		// print number 20
		System.out.println(numbers[0][2]);
		
		
        // 2D arrays are array of arrays
		// If we know the values upfront --> we can do this way

		int[][] nums = { 
				{ 10, 15, 20, 25 }, 
				{ 32, 36, 40, 44 }, 
				{ 63, 66, 69, 72 } 
				};
		
		System.out.println(nums[2][2]); //print 69
		System.out.println(nums[1][3]); // print 44

	}

}

