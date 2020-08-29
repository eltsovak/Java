package com.syntax.class17;

public class Student {


//	Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
//	score > 90 - A
//
//	score >80 - B
//
//	score >70 - C
//
//	score > 50 - D
//
//	anything else - F

char getGrade (int a) {
if (a > 50 && a <= 70) {
	return 'D';
} else if(a > 70 && a <= 80) {
	return 'C';
} else if(a > 80 && a <= 90) {
	return 'B';
} else if(a > 90) {
	return 'A';
} else {
	return 'F';
}
}


}




